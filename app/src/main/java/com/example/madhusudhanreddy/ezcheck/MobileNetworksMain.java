package com.example.madhusudhanreddy.ezcheck;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.madhusudhanreddy.ezcheck.mobilenetworks.Aircel_In;
import com.example.madhusudhanreddy.ezcheck.mobilenetworks.Airtel_In;
import com.example.madhusudhanreddy.ezcheck.mobilenetworks.Bsnl_In;
import com.example.madhusudhanreddy.ezcheck.mobilenetworks.Idea_In;
import com.example.madhusudhanreddy.ezcheck.mobilenetworks.RelianceJio_In;
import com.example.madhusudhanreddy.ezcheck.mobilenetworks.Reliance_In;
import com.example.madhusudhanreddy.ezcheck.mobilenetworks.TataDocomo_In;
import com.example.madhusudhanreddy.ezcheck.mobilenetworks.Unionr_In;
import com.example.madhusudhanreddy.ezcheck.mobilenetworks.Vodaphone_In;

import static com.example.madhusudhanreddy.ezcheck.R.id.reliancejio;

/**
 * Created by Madhusudhan Reddy on 5/31/2017.
 */
public class MobileNetworksMain extends Activity
{

    ImageView airtelcall,aircelcall,bsnlcall,docomocall,ideacall,reliancecall,vodacall,unionrcall,reliancejiocall,airtel,aircel,bsnl,idea,reliance,jio,tatadocomo,unionr,vodaphone;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobile_networks);
        airtelcall=(ImageView)findViewById(R.id.airtelcalling);
        aircelcall=(ImageView)findViewById(R.id.aircelcalling);
        bsnlcall= (ImageView) findViewById(R.id.bsnlcalling);
        ideacall=(ImageView)findViewById(R.id.ideacalling);
        docomocall=(ImageView)findViewById(R.id.docomocalling);
        reliancecall= (ImageView) findViewById(R.id.reliancecalling);
        vodacall=(ImageView)findViewById(R.id.vodacalling);
        unionrcall=(ImageView)findViewById(R.id.unionrcalling);
        reliancecall=(ImageView)findViewById(R.id.reliancecalling);
        reliancejiocall=(ImageView)findViewById(R.id.reliancejiocalling) ;

        airtel=(ImageView)findViewById(R.id.airtel);
        aircel=(ImageView)findViewById(R.id.aircel);
        bsnl=(ImageView)findViewById(R.id.bsnl);
        idea=(ImageView)findViewById(R.id.idea);
        reliance=(ImageView)findViewById(R.id.reliance);
        jio=(ImageView)findViewById(reliancejio);
        tatadocomo=(ImageView)findViewById(R.id.tatadocomo);
        unionr=(ImageView)findViewById(R.id.unionr);
        vodaphone=(ImageView)findViewById(R.id.vadaphone);



        Glide.with(MobileNetworksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/airtel.png").placeholder(R.drawable.network_logo).into(airtel);

        Glide.with(MobileNetworksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/aircel.png").placeholder(R.drawable.network_logo).into(aircel);

        Glide.with(MobileNetworksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/bsnl.png").placeholder(R.drawable.network_logo).into(bsnl);

        Glide.with(MobileNetworksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/reliance.png").placeholder(R.drawable.network_logo).into(reliance);

        Glide.with(MobileNetworksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/docomo.png").placeholder(R.drawable.network_logo).into(tatadocomo);

        Glide.with(MobileNetworksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/jio.png").placeholder(R.drawable.network_logo).into(jio);

        Glide.with(MobileNetworksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/idea.png").placeholder(R.drawable.network_logo).into(idea);

        Glide.with(MobileNetworksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/vodaphone.png").placeholder(R.drawable.network_logo).into(vodaphone);

        Glide.with(MobileNetworksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/unionr.png").placeholder(R.drawable.network_logo).into(unionr);


        airtelcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileNetworksMain.this,Airtel_In.class);
                startActivity(intent);
            }
        });
        aircelcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileNetworksMain.this,Aircel_In.class);
                startActivity(intent);
            }
        });
        bsnlcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileNetworksMain.this,Bsnl_In.class);
                startActivity(intent);
            }
        });
        ideacall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileNetworksMain.this,Idea_In.class);
                startActivity(intent);
            }
        });
        docomocall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileNetworksMain.this,TataDocomo_In.class);
                startActivity(intent);
            }
        });
        reliancecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileNetworksMain.this,Reliance_In.class);
                startActivity(intent);
            }
        });
        unionrcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileNetworksMain.this, Unionr_In.class);
                startActivity(intent);
            }
        });
        vodacall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileNetworksMain.this, Vodaphone_In.class);
                startActivity(intent);
            }
        });
        reliancecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileNetworksMain.this, Reliance_In.class);
                startActivity(intent);

            }
        });
        reliancejiocall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MobileNetworksMain.this, RelianceJio_In.class);
                startActivity(intent);
            }
        });

    }
}
