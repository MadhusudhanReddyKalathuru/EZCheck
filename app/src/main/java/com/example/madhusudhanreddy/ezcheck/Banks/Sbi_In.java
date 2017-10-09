package com.example.madhusudhanreddy.ezcheck.Banks;

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

import com.example.madhusudhanreddy.ezcheck.R;

/**
 * Created by Madhusudhan Reddy on 6/21/2017.
 */

public class Sbi_In extends Activity
{
    Button balence;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sbi_in);
        balence=(Button)findViewById(R.id.sbi_balence);
        //Sbi Bank Balence Check
        balence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "09223766666";
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));
                if (ActivityCompat.checkSelfPermission(Sbi_In.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(callIntent);
            }
        });
        //
    }
}
