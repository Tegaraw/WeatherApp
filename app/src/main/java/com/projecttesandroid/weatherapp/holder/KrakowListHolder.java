package com.projecttesandroid.weatherapp.holder;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.projecttesandroid.weatherapp.R;
import com.projecttesandroid.weatherapp.model.KrakowList;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.droidsonroids.gif.GifImageView;


public class KrakowListHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.maxTempList)
    TextView maxTempList;
    @BindView(R.id.minTempList)
    TextView minTempList;
    @BindView(R.id.statusList)
    TextView statusList;
    @BindView(R.id.timeList)
    TextView timeList;
    @BindView(R.id.statusDetail)
    TextView statusDetail;
    @BindView(R.id.iconMiniList)
    GifImageView iconMiniList;

    public KrakowListHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @SuppressLint("SetTextI18n")
    public void updateUI(KrakowList weatherList) {
        maxTempList.setText(String.valueOf(weatherList.getTempMax()) + (char) 0x00B0 + "C");
        minTempList.setText(String.valueOf(weatherList.getTempMin()) + (char) 0x00B0 + "C");
        statusList.setText(weatherList.getStatus());
        timeList.setText(weatherList.getTime());
        statusDetail.setText(weatherList.getStatusDetail());

        if (weatherList.getStatus().equals("Rain")) {
            iconMiniList.setImageResource(R.drawable.hujan);
        } else if (weatherList.getStatus().equals("Clouds")) {
            iconMiniList.setImageResource(R.drawable.awan);
        } else {
            iconMiniList.setImageResource(R.drawable.cerah);
        }

    }

}
