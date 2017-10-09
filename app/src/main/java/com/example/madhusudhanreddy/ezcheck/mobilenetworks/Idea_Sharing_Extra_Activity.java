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
import android.widget.Toast;

import com.example.madhusudhanreddy.ezcheck.R;

/**
 * Created by Madhusudhan Reddy on 6/17/2017.
 */

public class Idea_Sharing_Extra_Activity extends Activity {
    EditText et1, et2;
    Button bt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idea_sharing_extra_layout);
        et1 = (EditText) findViewById(R.id.idea_share_edit);
        et2 = (EditText) findViewById(R.id.idea_share_edit_amount);
        bt = (Button) findViewById(R.id.share_button);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = "*151*";
                String s2 = et1.getText().toString();
                String s3 = et2.getText().toString();
                String s4 = Uri.encode("#");

                if(s2.isEmpty())
                {
                    Toast.makeText(Idea_Sharing_Extra_Activity.this,"Please Enter Friends Mobile Number",Toast.LENGTH_LONG).show();
                }

                String s5 = s1 + s2 + s3 + s4;
                if (ActivityCompat.checkSelfPermission(Idea_Sharing_Extra_Activity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + s5)));
                Toast.makeText(Idea_Sharing_Extra_Activity.this,"Successfully Completed",Toast.LENGTH_LONG).show();
            }
        });
    }
}
