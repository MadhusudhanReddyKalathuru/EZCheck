package com.example.madhusudhanreddy.ezcheck.mobilenetworks;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.madhusudhanreddy.ezcheck.R;

/**
 * Created by Madhusudhan Reddy on 6/23/2017.
 */

public class RelianceJio_In extends Activity
{
    ImageView logo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jio_in);
        logo=(ImageView)findViewById(R.id.reliance_jio_title);

        Glide.with(RelianceJio_In.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/jio.png").placeholder(R.drawable.network_logo).into(logo);

    }
}
