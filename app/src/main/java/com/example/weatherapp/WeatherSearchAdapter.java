package com.example.weatherapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class WeatherSearchAdapter extends RecyclerView.Adapter<WeatherSearchAdapter.ViewHolder> {

    private ArrayList<String> commonObjectList;
    private ArrayList<String> filteredArrayList;
    private ArrayList<String> baseObjectList;
    private OnSearchItemClick listener;

    public WeatherSearchAdapter(ArrayList<String> accountLists, OnSearchItemClick listener) {
        this.commonObjectList = accountLists;
        this.filteredArrayList = accountLists;
        this.baseObjectList = accountLists;
        this.listener = listener;
    }

    @NonNull
    @Override
    public WeatherSearchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_single_textview, parent, false));
    }

    @Override
    public void onBindViewHolder(WeatherSearchAdapter.ViewHolder holder, int position) {
        String account = filteredArrayList.get(position);
        holder.account.setText(account);

        holder.itemView.setOnClickListener(view -> listener.sendSelectInfo(account, position));
    }

    @Override
    public int getItemCount() {
        return commonObjectList.size();
    }

    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                FilterResults filterResults = new FilterResults();
                String charString = charSequence.toString();
                if (baseObjectList.size() > 0) {
                    if (charString.isEmpty()) {
                        filteredArrayList = baseObjectList;
                    } else {
                        ArrayList<String> filteredList = new ArrayList<>();
                        for (String partcipents : baseObjectList) {
                            if (partcipents.toLowerCase().contains(charString) || partcipents.toLowerCase().contains(charString)) {
                                filteredList.add(partcipents);
                            }
                        }
                        filteredArrayList = filteredList;
                    }
                }

                filterResults.count = filteredArrayList.size();
                filterResults.values = filteredArrayList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                commonObjectList = (ArrayList<String>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public interface OnSearchItemClick {
        void sendSelectInfo(String account, int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        AppCompatTextView account;

        public ViewHolder(View itemView) {
            super(itemView);

            account = itemView.findViewById(R.id.item_single_textView);
        }
    }
}
