package com.example.madhusudhanreddy.ezcheck.mobilenetworks;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.madhusudhanreddy.ezcheck.R;

/**
 * Created by Madhusudhan Reddy on 6/3/2017.
 */

public class Aircel_In extends Activity
{
    ImageView logo;
    EditText aircel_edittext;
    Button aircel_recharge_button,aircel_balence,aircel_loan,aircel_checkmobilenumber,aircel_customercare,aircel_mailcare,aircel_share,aircel_money,aircel_check_data_balence,aircel_sms_balence,aircel_valueaddedservices;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aircel_in);
        aircel_edittext=(EditText)findViewById(R.id.aircel_edittext);
        aircel_recharge_button=(Button)findViewById(R.id.aircel_recharge_button);
        aircel_balence=(Button)findViewById(R.id.aircel_balence);
        aircel_loan=(Button)findViewById(R.id.aircel_loan);
        aircel_checkmobilenumber=(Button)findViewById(R.id.aircel_checkmobilenumber);
        aircel_customercare=(Button)findViewById(R.id.aircel_customercare);
        aircel_mailcare=(Button)findViewById(R.id.aircel_mailcare);
        aircel_share=(Button)findViewById(R.id.aircel_share);
        aircel_money=(Button)findViewById(R.id.aircel_money);
        aircel_check_data_balence=(Button)findViewById(R.id.aircel_check_data_balence);
        aircel_sms_balence=(Button)findViewById(R.id.aircel_sms_balence);
        aircel_valueaddedservices=(Button)findViewById(R.id.aircel_valueaddedservices);
        logo=(ImageView)findViewById(R.id.aircel_title);

        //Loading Image From Server using Glide Library
        String url="http://nikhilkumar.hostei.com/EZCheckLogos/aircel.png";
        Glide.with(this).load(url).placeholder(R.drawable.network_logo).into(logo);
        // For Recharge
        aircel_recharge_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String couponcode = aircel_edittext.getText().toString();

                if (couponcode.isEmpty()) {
                    Toast.makeText(Aircel_In.this, "Enter Recharge Coupon Code", Toast.LENGTH_LONG).show();
                } else {
                    String a1 = "*124*";
                    String a2 = aircel_edittext.getText().toString();
                    if (a2.matches("^\\d{16}")) {
                        String m = Uri.encode("#");
                        String ee = a1 + a2 + m;
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + ee)));
                    } else {
                        Toast.makeText(Aircel_In.this, "Plese Enter 16dits only", Toast.LENGTH_LONG).show();
                    }
                }
                if (ActivityCompat.checkSelfPermission(Aircel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
            }
        });
//
        aircel_balence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String balance = "*125" + Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Aircel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + balance)));
            }
        });
//
        aircel_loan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String loan="*414"+Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Aircel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + loan)));
            }
        });
  //
        aircel_checkmobilenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String checkmobilenumber="*1"+Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Aircel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + checkmobilenumber)));
            }
        });
//
        aircel_customercare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String customercare="18001033003";
                if (ActivityCompat.checkSelfPermission(Aircel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + customercare)));
            }
        });
        aircel_mailcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of email");
                intent.putExtra(Intent.EXTRA_TEXT, "Body of email");
                intent.setData(Uri.parse("mailto:technicalhelpdesk@aircel.co.in")); // or just "mailto:" for blank
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
                startActivity(intent);
            }
        });
        aircel_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String customercare="*122*666"+Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Aircel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + customercare)));
            }
        });
        aircel_money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Aircel_In.this,"Aircel Money Not Available",Toast.LENGTH_LONG).show();
            }
        });
        aircel_check_data_balence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Aircel_In.this,"this option under construction",Toast.LENGTH_LONG).show();
            }
        });
        aircel_sms_balence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String checkmobilenumber="*126*9"+Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Aircel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + checkmobilenumber)));
            }
        });
        aircel_valueaddedservices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Aircel_In.this,"this option under construction",Toast.LENGTH_LONG).show();
            }
        });
    }
}
