package com.example.madhusudhanreddy.ezcheck.mobilenetworks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.madhusudhanreddy.ezcheck.R;

/**
 * Created by Madhusudhan Reddy on 6/8/2017.
 */

public class Idea_In extends Activity
{
    ImageView logo;
    Button idea_share;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idea_in);
        idea_share=(Button)findViewById(R.id.idea_share);
        logo=(ImageView)findViewById(R.id.idea_title);

        // Load Images from server
        String url="http://nikhilkumar.hostei.com/EZCheckLogos/idea.png";
        Glide.with(this).load(url).placeholder(R.drawable.network_logo).into(logo);
        //
        idea_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Idea_In.this,Idea_Sharing_Extra_Activity.class);
                startActivity(intent);
        }
        });
    }
}
