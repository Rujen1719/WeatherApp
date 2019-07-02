package com.example.weatherapp.RetrofitSample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Toast;

import com.example.weatherapp.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mListView;
    ArrayList<Model.Data.Daily> arrayList = new ArrayList<>();
    ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.main_list_View);

        RestClient.getRestClient().getApiData().enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                if (response.body().getStatus().equals("success")) {
                    Model model = response.body();
                    arrayList.addAll(model.getData().getDailyMarketSummary());
                    sendToAdapter(arrayList);
                }
            }


            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void sendToAdapter(ArrayList<Model.Data.Daily> arrayList) {
        mAdapter = new ListAdapter(this, arrayList);
        mListView.setLayoutManager(new LinearLayoutManager(this));
        mListView.setAdapter(mAdapter);
    }
}
