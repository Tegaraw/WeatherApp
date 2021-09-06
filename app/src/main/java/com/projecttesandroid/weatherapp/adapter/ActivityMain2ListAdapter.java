package com.projecttesandroid.weatherapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;


import com.projecttesandroid.weatherapp.R;
import com.projecttesandroid.weatherapp.holder.ActivityMain2rListHolder;
import com.projecttesandroid.weatherapp.model.Activitymain2List;

import java.util.ArrayList;


public class ActivityMain2ListAdapter extends RecyclerView.Adapter<ActivityMain2rListHolder> {

    private ArrayList<Activitymain2List> mWeatherlist;

    public ActivityMain2ListAdapter(ArrayList<Activitymain2List> mWeatherlist) {
        this.mWeatherlist = mWeatherlist;
    }

    @Override
    public ActivityMain2rListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_weather, parent, false);
        return new ActivityMain2rListHolder(card);
    }

    @Override
    public void onBindViewHolder(ActivityMain2rListHolder holder, int position) {
        Activitymain2List weatherListh = mWeatherlist.get(position);
        holder.updateUI(weatherListh);
    }

    @Override
    public int getItemCount() {
        return mWeatherlist.size();
    }
}
