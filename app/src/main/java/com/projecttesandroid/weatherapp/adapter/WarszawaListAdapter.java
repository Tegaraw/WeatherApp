package com.projecttesandroid.weatherapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.projecttesandroid.weatherapp.R;
import com.projecttesandroid.weatherapp.holder.WarszawaListHolder;
import com.projecttesandroid.weatherapp.model.WarszawaList;

import java.util.ArrayList;


public class WarszawaListAdapter extends RecyclerView.Adapter<WarszawaListHolder> {

    private ArrayList<WarszawaList> mWeatherlist;

    public WarszawaListAdapter(ArrayList<WarszawaList> mWeatherlist) {
        this.mWeatherlist = mWeatherlist;
    }

    @Override
    public WarszawaListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_weather, parent, false);
        return new WarszawaListHolder(card);
    }

    @Override
    public void onBindViewHolder(@NonNull WarszawaListHolder holder, int position) {
        WarszawaList weatherListh = mWeatherlist.get(position);
        holder.updateUI(weatherListh);
    }

    @Override
    public int getItemCount() {
        return mWeatherlist.size();
    }
}
