package com.example.madhusudhanreddy.ezcheck.mobilenetworks;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
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

public class Airtel_In extends Activity
{
    EditText airtel_edittext;
    Button  airtel_recharge_button, airtel_balence, airtel_loan,
            airtel_checkmobilenumber, airtel_customercare, airtel_mailcare,
            airtel_share, airtel_money, check_data_balence,airtel_sms_balence,
            airtel_valueaddedservices,airtel_5last_call_charges,port,airtel_rewardtune;
    ImageView logo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.airtel_in);
        airtel_edittext = (EditText) findViewById(R.id.airtel_edittext);
        airtel_recharge_button = (Button) findViewById(R.id.airtel_recharge_button);
        airtel_balence = (Button) findViewById(R.id.airtel_balence);
        airtel_loan = (Button) findViewById(R.id.airtel_loan);
        airtel_checkmobilenumber = (Button) findViewById(R.id.airtel_checkmobilenumber);
        airtel_customercare = (Button) findViewById(R.id.airtel_customercare);
        airtel_mailcare = (Button) findViewById(R.id.airtel_mailcare);
        airtel_share = (Button) findViewById(R.id.airtel_share);
        airtel_money = (Button) findViewById(R.id.airtel_money);
        check_data_balence = (Button) findViewById(R.id.check_data_balence);
        airtel_sms_balence=(Button)findViewById(R.id.airtel_sms_balence);
        airtel_valueaddedservices=( Button)findViewById(R.id.airtel_valueaddedservices);
        airtel_5last_call_charges=(Button)findViewById(R.id.last_callcharges);
        port=(Button)findViewById(R.id.port);
        airtel_rewardtune=(Button)findViewById(R.id.airtel_rewardtunes);
        logo=(ImageView)findViewById(R.id.airtel_title);

       //Loading Image From Server using Glide Library
        String url="http://nikhilkumar.hostei.com/EZCheckLogos/airtel.png";
        Glide.with(this).load(url).placeholder(R.drawable.network_logo).into(logo);
        //Airtel Recharge Button
        airtel_recharge_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String couponcode = airtel_edittext.getText().toString();

                if (couponcode.isEmpty()) {
                    Toast.makeText(Airtel_In.this, "Enter Recharge Coupon Code", Toast.LENGTH_LONG).show();
                } else {
                    String a1 = "*121*3*";
                    String a2 = airtel_edittext.getText().toString();
                    if (a2.matches("^\\d{16}")) {
                        String m = Uri.encode("#");
                        String ee = a1 + a2 + m;
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + ee)));
                    } else {
                        Toast.makeText(Airtel_In.this, "Plese Enter 16dits only", Toast.LENGTH_LONG).show();
                    }
                }
                if (ActivityCompat.checkSelfPermission(Airtel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
            }
        });
 //
        airtel_balence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String balance = "*123" + Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Airtel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + balance)));
            }
        });
//
        airtel_loan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String loan="*141*10"+Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Airtel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + loan)));
            }
        });
     //
        airtel_checkmobilenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value="*282"+Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Airtel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + value)));
            }
        });
        airtel_customercare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value="121";
                if (ActivityCompat.checkSelfPermission(Airtel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + value)));
            }
        });
//
        airtel_mailcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of email");
                intent.putExtra(Intent.EXTRA_TEXT, "Body of email");
                intent.setData(Uri.parse("mailto:121@in.airtel.com")); // or just "mailto:" for blank
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
                startActivity(intent);
            }
        });
 //
        airtel_money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value="*400"+Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Airtel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + value)));
            }
        });
//
        airtel_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value="*141"+Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Airtel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + value)));
            }
        });
//
        check_data_balence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value="*121*2"+Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Airtel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + value)));
            }
        });
//
        airtel_sms_balence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value="*121*2"+Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Airtel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + value)));
            }
        });
 //
        airtel_valueaddedservices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value="*121*5"+Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Airtel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + value)));
            }
        });
 //
        airtel_5last_call_charges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value="*121*7"+Uri.encode("#");
                Toast.makeText(Airtel_In.this,"After Choose 2 Option",Toast.LENGTH_LONG).show();
                if (ActivityCompat.checkSelfPermission(Airtel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + value)));
            }
        });
        //
        port.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TelephonyManager tm = (TelephonyManager)getSystemService(TELEPHONY_SERVICE);

                //---get the phone number---
                String telNumber = tm.getSimSerialNumber();
                if (telNumber != null)
                    Toast.makeText(Airtel_In.this, "Phone number: " + telNumber, Toast.LENGTH_LONG).show();
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse("sms:1900"));
                smsIntent.putExtra("sms_body", "PORT  "+telNumber);
                startActivity(smsIntent);
            }
        });
        //
        airtel_rewardtune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value="50080";
                if (ActivityCompat.checkSelfPermission(Airtel_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + value)));
            }
        });
    }
}
