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
 * Created by Madhusudhan Reddy on 6/8/2017.
 */

public class Bsnl_In extends Activity
{
    ImageView logo;
    EditText bsnl_edittext;
    Button bsnl_recharge_button,bsnl_balence,bsnl_loan,bsnl_checkmobilenumber,bsnl_customercare,bsnl_mailcare,
            bsnl_share,bsnl_money,bsnl_check_data_balence,bsnl_sms_balence,bsnl_valueaddedservices,bsnl_lastcall;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bsnl_in);

        bsnl_edittext=(EditText)findViewById(R.id.bsnl_edittext);
        bsnl_recharge_button=(Button)findViewById(R.id.bsnl_recharge_button);
        bsnl_balence=(Button)findViewById(R.id.bsnl_balence);
        bsnl_loan=(Button)findViewById(R.id.bsnl_loan);
        bsnl_checkmobilenumber=(Button)findViewById(R.id.bsnl_checkmobilenumber);
        bsnl_customercare=(Button)findViewById(R.id.bsnl_customercare);
        bsnl_mailcare=(Button)findViewById(R.id.bsnl_mailcare);
        bsnl_share=(Button)findViewById(R.id.bsnl_share);
        bsnl_money=(Button)findViewById(R.id.bsnl_money);
        bsnl_check_data_balence=(Button)findViewById(R.id.bsnl_check_data_balence);
        bsnl_sms_balence=(Button)findViewById(R.id.bsnl_sms_balence);
        bsnl_valueaddedservices=(Button)findViewById(R.id.bsnl_valueaddedservices);
        bsnl_lastcall=(Button)findViewById(R.id.bsnl_lastcallcharges);
        logo=(ImageView)findViewById(R.id.bsnl_title);


        //
        String url="http://nikhilkumar.hostei.com/EZCheckLogos/bsnl.png";
        Glide.with(this).load(url).placeholder(R.drawable.network_logo).into(logo);
        //2
        bsnl_recharge_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String couponcode = bsnl_edittext.getText().toString();

                if (couponcode.isEmpty()) {
                    Toast.makeText(Bsnl_In.this, "Enter Recharge Coupon Code", Toast.LENGTH_LONG).show();
                } else {
                    String a1 = "*123*2*";
                    String a2 = bsnl_edittext.getText().toString();
                    if (a2.matches("^\\d{16}")) {
                        String m = Uri.encode("#");
                        String ee = a1 + a2 + m;
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + ee)));
                    } else {
                        Toast.makeText(Bsnl_In.this, "Plese Enter 16dits only", Toast.LENGTH_LONG).show();
                    }
                }
                if (ActivityCompat.checkSelfPermission(Bsnl_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
            }
        });

        //3
        bsnl_balence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String balance = "*123" + Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Bsnl_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + balance)));
            }
        });
        //4
        bsnl_loan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bsnl_In.this,"No loan number is available for bsnl customers. when bsnl will start loan service we will update",Toast.LENGTH_LONG).show();
            }
        });
        //5
        bsnl_checkmobilenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String checkmobilenumber = "*222" + Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Bsnl_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + checkmobilenumber)));
            }
        });
        //6
        bsnl_customercare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String customercare = "1503";
                if (ActivityCompat.checkSelfPermission(Bsnl_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + customercare)));
            }
        });
        //7
        bsnl_mailcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of email");
                intent.putExtra(Intent.EXTRA_TEXT, "Body of email");
                intent.setData(Uri.parse("mailto:portalhelpdesk@bsnl.co.in")); // or just "mailto:" for blank
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
                startActivity(intent);
            }
        });
        //8
        bsnl_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse("sms:54455"));
                smsIntent.putExtra("sms_body", "register ptop");
                startActivity(smsIntent);
                Toast.makeText(Bsnl_In.this,"After Sending SMS Bsnl Send One Password To Your Mobile Number",Toast.LENGTH_LONG).show();
                Toast.makeText(Bsnl_In.this,"Gift<space>Mobile Number<Space>Amount<space>Password    Send To 54456",Toast.LENGTH_LONG).show();

            }
        });
        //10
        bsnl_check_data_balence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String balance = "*234" + Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Bsnl_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + balance)));
            }
        });
        //11
        bsnl_sms_balence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String balance = "*125" + Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Bsnl_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + balance)));
            }
        });
        bsnl_lastcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String balance = "*123*4" + Uri.encode("#");
                if (ActivityCompat.checkSelfPermission(Bsnl_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + balance)));
            }
        });


    }
}
