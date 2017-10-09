package com.example.madhusudhanreddy.ezcheck.mobilenetworks;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.madhusudhanreddy.ezcheck.R;

/**
 * Created by Madhusudhan Reddy on 6/18/2017.
 */

public class Reliance_In extends Activity
{
    ImageView logo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relaince_in);
        logo=(ImageView)findViewById(R.id.reliance_title);

        Glide.with(Reliance_In.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/reliance.png").placeholder(R.drawable.network_logo).into(logo);

    }
}
