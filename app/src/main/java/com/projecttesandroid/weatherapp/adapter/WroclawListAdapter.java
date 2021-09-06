package com.projecttesandroid.weatherapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.projecttesandroid.weatherapp.R;
import com.projecttesandroid.weatherapp.holder.WroclawListHolder;
import com.projecttesandroid.weatherapp.model.WroclawList;

import java.util.ArrayList;


public class WroclawListAdapter extends RecyclerView.Adapter<WroclawListHolder> {

    private ArrayList<WroclawList> mWeatherlist;

    public WroclawListAdapter(ArrayList<WroclawList> mWeatherlist) {
        this.mWeatherlist = mWeatherlist;
    }

    @Override
    public WroclawListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_weather, parent, false);
        return new WroclawListHolder(card);
    }

    @Override
    public void onBindViewHolder(WroclawListHolder holder, int position) {
        WroclawList weatherList = mWeatherlist.get(position);
        holder.updateUI(weatherList);
    }

    @Override
    public int getItemCount() {
        return mWeatherlist.size();
    }
}
