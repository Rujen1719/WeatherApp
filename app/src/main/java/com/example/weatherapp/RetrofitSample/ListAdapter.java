package com.example.weatherapp.RetrofitSample;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.weatherapp.R;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    Activity activity;
    ArrayList<Model.Data.Daily> arrayList = new ArrayList<>();


    public ListAdapter(Activity activity, ArrayList<Model.Data.Daily> arrayList) {
        this.activity = activity;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_single_layout,
                viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder viewHolder, int i) {
        viewHolder.mName.setText("Name: " + arrayList.get(i).getName());
        viewHolder.mAuthorSource.setText("Author_source: " + arrayList.get(i).getAuthor_source());
        viewHolder.mDescription.setText("Description: " + arrayList.get(i).getDescription());

        Glide.with(activity).load(arrayList.get(i).getImage()).into(viewHolder.mImage);
        viewHolder.mPostedOn.setText("Posted_on: " + arrayList.get(i).getPosted_on());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView mName;
        private TextView mAuthorSource;
        private TextView mDescription;
        private ImageView mImage;
        private TextView mPostedOn;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            mName = itemView.findViewById(R.id.list_single_layout_name);
            mAuthorSource = itemView.findViewById(R.id.list_single_layout_author_source);
            mDescription = itemView.findViewById(R.id.list_single_layout_description);
            mImage = itemView.findViewById(R.id.list_single_layout_image);
            mPostedOn = itemView.findViewById(R.id.list_single_layout_posted_on);

        }
    }
}
