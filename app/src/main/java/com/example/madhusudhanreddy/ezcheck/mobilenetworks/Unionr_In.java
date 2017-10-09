package com.example.madhusudhanreddy.ezcheck.mobilenetworks;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.madhusudhanreddy.ezcheck.R;

/**
 * Created by Madhusudhan Reddy on 6/22/2017.
 */

public class Unionr_In extends Activity
{
    ImageView logo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unionr_in);
        logo=(ImageView)findViewById(R.id.unionr_title);

        Glide.with(Unionr_In.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/unionr.png").placeholder(R.drawable.network_logo).into(logo);

    }
}
