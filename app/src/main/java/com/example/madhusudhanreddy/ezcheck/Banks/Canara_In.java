package com.example.madhusudhanreddy.ezcheck.Banks;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.example.madhusudhanreddy.ezcheck.R;

/**
 * Created by Madhusudhan Reddy on 6/3/2017.
 */

public class Canara_In extends Activity
{
    ImageView logo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.canara_in);
        logo=(ImageView)findViewById(R.id.canara_title);

        String url="http://nikhilkumar.hostei.com/EZCheckLogos/canara.png";
        Glide.with(this).load(url).placeholder(R.drawable.bank_logo).into(logo);
    }
}
