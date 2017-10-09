package com.example.madhusudhanreddy.ezcheck;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.example.madhusudhanreddy.ezcheck.Banks.Axis_In;
import com.example.madhusudhanreddy.ezcheck.Banks.Canara_In;
import com.example.madhusudhanreddy.ezcheck.Banks.Kotak_In;
import com.example.madhusudhanreddy.ezcheck.Banks.Sbi_In;

/**
 * Created by Madhusudhan Reddy on 5/31/2017.
 */

public class BanksMain extends Activity
{
    ImageView  canaracall,sbicall,kotakcall,axiscall,icicicall,punjabcall,syndicatecall,unioncall,indiancall,canarab,stateb,kotakb,axisb,icicib,punjabb,syndicateb,unionb,indianb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banksmain);
        canaracall = (ImageView) findViewById(R.id.canarcalling);
        sbicall = (ImageView) findViewById(R.id.sbicalling);
        kotakcall = (ImageView) findViewById(R.id.kotakcalling);
        axiscall = (ImageView) findViewById(R.id.axiscalling);
        icicicall=(ImageView)findViewById(R.id.icicicalling);
        punjabcall=(ImageView)findViewById(R.id.punjabicalling);
        syndicatecall=(ImageView)findViewById(R.id.syndiactecalling);
        unioncall=(ImageView)findViewById(R.id.unioncalling);
        indiancall=(ImageView)findViewById(R.id.indaincalling);

        canarab=(ImageView)findViewById(R.id.canarabank);
        stateb=(ImageView)findViewById(R.id.statebankofindia);
        kotakb=(ImageView)findViewById(R.id.kotakmahindrabank);
        axisb=(ImageView)findViewById(R.id.axisbank);
        icicib=(ImageView)findViewById(R.id.icicibank);
        punjabb=(ImageView)findViewById(R.id.punjabnationalbank);
        syndicateb=(ImageView)findViewById(R.id.syndicatebank);
        unionb=(ImageView)findViewById(R.id.unionbank);
        indianb=(ImageView)findViewById(R.id.indianbank);

        Glide.with(BanksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/canara.png").placeholder(R.drawable.bank_logo).into(canarab);
        Glide.with(BanksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/sbi.png").placeholder(R.drawable.bank_logo).into(stateb);
        Glide.with(BanksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/kotak.png").placeholder(R.drawable.bank_logo).into(kotakb);
        Glide.with(BanksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/axis.png").placeholder(R.drawable.bank_logo).into(axisb);
        Glide.with(BanksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/icici.png").placeholder(R.drawable.bank_logo).into(icicib);
        Glide.with(BanksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/punjabi.png").placeholder(R.drawable.bank_logo).into(punjabb);
        Glide.with(BanksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/syndicate.png").placeholder(R.drawable.bank_logo).into(syndicateb);
        Glide.with(BanksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/union.png").placeholder(R.drawable.bank_logo).into(unionb);
        Glide.with(BanksMain.this).load("http://nikhilkumar.hostei.com/EZCheckLogos/indianbank.png").placeholder(R.drawable.bank_logo).into(indianb);

        //Canara Bank Phone Calling
        canaracall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BanksMain.this,Canara_In.class);
                startActivity(intent);
            }
        });

        //SBI Bank Phone Calling
        sbicall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BanksMain.this, Sbi_In.class);
                startActivity(intent);
            }
        });

        //Kotak Calling
        kotakcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BanksMain.this, Kotak_In.class);
                startActivity(intent);
            }
        });
        //Axis calling
        axiscall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(BanksMain.this, Axis_In.class);
                startActivity(intent);
            }
        });
        //Icici calling
        icicicall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = "02230256767";
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));
                if (ActivityCompat.checkSelfPermission(BanksMain.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(callIntent);
            }
        });
        //punjab calling
        punjabcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = "18001802222";
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));
                if (ActivityCompat.checkSelfPermission(BanksMain.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(callIntent);
            }
        });
        //Syndicate calling
        syndicatecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = "09664552255";
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));
                if (ActivityCompat.checkSelfPermission(BanksMain.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(callIntent);
            }
        });
        //Union Calling
        unioncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = "09223008586";
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));
                if (ActivityCompat.checkSelfPermission(BanksMain.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(callIntent);
            }

        });

        indiancall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = "09289592895";
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));
                if (ActivityCompat.checkSelfPermission(BanksMain.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(callIntent);
            }

        });
    }
}
