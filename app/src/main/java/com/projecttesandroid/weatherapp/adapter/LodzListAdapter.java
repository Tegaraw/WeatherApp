package com.projecttesandroid.weatherapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.projecttesandroid.weatherapp.R;
import com.projecttesandroid.weatherapp.holder.LodzListHolder;
import com.projecttesandroid.weatherapp.model.LodzList;

import java.util.ArrayList;


public class LodzListAdapter extends RecyclerView.Adapter<LodzListHolder> {

    private ArrayList<LodzList> mWeatherlist;

    public LodzListAdapter(ArrayList<LodzList> mWeatherlist) {
        this.mWeatherlist = mWeatherlist;
    }

    @Override
    public LodzListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_weather, parent, false);
        return new LodzListHolder(card);
    }

    @Override
    public void onBindViewHolder(LodzListHolder holder, int position) {
        LodzList weatherList = mWeatherlist.get(position);
        holder.updateUI(weatherList);
    }

    @Override
    public int getItemCount() {
        return mWeatherlist.size();
    }
}
