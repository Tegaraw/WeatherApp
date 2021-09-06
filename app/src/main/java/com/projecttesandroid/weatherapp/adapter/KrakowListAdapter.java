package com.projecttesandroid.weatherapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.projecttesandroid.weatherapp.R;
import com.projecttesandroid.weatherapp.holder.KrakowListHolder;
import com.projecttesandroid.weatherapp.model.KrakowList;

import java.util.ArrayList;


public class KrakowListAdapter extends RecyclerView.Adapter<KrakowListHolder> {

    private ArrayList<KrakowList> mWeatherlist;

    public KrakowListAdapter(ArrayList<KrakowList> mWeatherlist) {
        this.mWeatherlist = mWeatherlist;
    }

    @Override
    public KrakowListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_weather, parent, false);
        return new KrakowListHolder(card);
    }

    @Override
    public void onBindViewHolder(@NonNull KrakowListHolder holder, int position) {
        KrakowList weatherListh = mWeatherlist.get(position);
        holder.updateUI(weatherListh);
    }

    @Override
    public int getItemCount() {
        return mWeatherlist.size();
    }
}
