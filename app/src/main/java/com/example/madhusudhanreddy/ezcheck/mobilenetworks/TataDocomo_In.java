package com.example.madhusudhanreddy.ezcheck.mobilenetworks;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.madhusudhanreddy.ezcheck.R;

/**
 * Created by Madhusudhan Reddy on 6/8/2017.
 */

public class TataDocomo_In  extends Activity
{
    Button tata_share;
    ImageView logo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tatadocomo_in);
        logo=(ImageView)findViewById(R.id.tatadocomo_title);
        tata_share=(Button)findViewById(R.id.tatadocomo_share);

        Glide.with(TataDocomo_In.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/docomo.png").placeholder(R.drawable.network_logo).into(logo);

    }
}
