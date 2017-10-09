package com.example.madhusudhanreddy.ezcheck;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
/**
 * Created by Madhusudhan Reddy on 6/21/2017.
 */

public class FeedBack extends Activity
{
    EditText e1,e2,e3,e4;
    Button feedback;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
        e1=(EditText)findViewById(R.id.fe1);
        e2=(EditText)findViewById(R.id.fe2);
        e3=(EditText)findViewById(R.id.fe3);
        e4=(EditText)findViewById(R.id.fe4);
        feedback=(Button)findViewById(R.id.feedbacksubmit);

        feedback.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String f1 = e1.getText().toString();
                String f2 = e2.getText().toString();
                String f3 = e3.getText().toString();
                String f4 = e4.getText().toString();
                String feedback = f1 + f2 + f3 + f4;

                if (f1.isEmpty()) {
                    Toast.makeText(FeedBack.this, "Please Enter Your Name", Toast.LENGTH_LONG).show();
                } else if (f2.isEmpty()) {
                    Toast.makeText(FeedBack.this, "Please Correct Email Id", Toast.LENGTH_LONG).show();
                } else if (f3.isEmpty()) {
                    Toast.makeText(FeedBack.this, "Please Enter Your Mobile Number", Toast.LENGTH_LONG).show();
                } else if (f4.isEmpty()) {
                    Toast.makeText(FeedBack.this, "Please Enter Your Valuble Feedback", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_SUBJECT, "FeedBack From EZCheck Application");
                    intent.putExtra(Intent.EXTRA_TEXT, "" + feedback);
                    intent.setData(Uri.parse("mailto:msreddy.kalathuru@gmail.com")); // or just "mailto:" for blank
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
                    startActivity(intent);
                }
            }
        });
    }
}
