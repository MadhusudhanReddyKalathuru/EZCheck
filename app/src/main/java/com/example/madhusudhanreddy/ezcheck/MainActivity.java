package com.example.madhusudhanreddy.ezcheck;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
     ImageView mobilenetworksmain,bankmain;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Layout Registration with Activity
        setContentView(R.layout.activity_main);

        //for register xml ids
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mobilenetworksmain=(ImageView)findViewById(R.id.mobilenetworksmain);
        bankmain=(ImageView)findViewById(R.id.banksmain);
        fab = (FloatingActionButton)findViewById(R.id.fab);
        setSupportActionBar(toolbar);

      //For Version Checking
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("Please Enable Marshmallow Permissions");
            alert.setMessage("Goto >Settings >Apps >Settings >App Permissions >Phone >EZCheck Enable");
            alert.setIcon(R.drawable.network_logo);
            alert.setPositiveButton("OK", null);
            alert.show();
        }

        //mobilenetworkmain  button clicks
        mobilenetworksmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,MobileNetworksMain.class);
                startActivity(intent);

            }
        });
        //bankmain button clicks
        bankmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,BanksMain.class);
                startActivity(intent);
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "FeedBack From EZCheck Application");
                intent.putExtra(Intent.EXTRA_TEXT, "");
                intent.setData(Uri.parse("mailto:msreddy.kalathuru@gmail.com"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
                startActivity(intent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if(id==R.id.nav_contactus)
        {
            Intent intent=new Intent(this,Contact_Us.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_feedback)
        {
            Intent intent=new Intent(MainActivity.this,FeedBack.class);
            startActivity(intent);

        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_about) {

        }
        else if (id == R.id.nav_netwoks)
        {
            Intent intent=new Intent(MainActivity.this,MobileNetworksMain.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_banks)
        {
            Intent intent=new Intent(MainActivity.this,BanksMain.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_feedback) {
            Intent intent=new Intent(MainActivity.this,FeedBack.class);
            startActivity(intent);

        } else if (id == R.id.nav_contactus)
        {
            Intent intent=new Intent(this,Contact_Us.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_rate)
        {
            Uri uri = Uri.parse("market://details?id=com.google.android.apps.maps" );
            Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(myAppLinkToMarket);

        }
        else if (id == R.id.nav_share) {

            String message = "Text I want to share.";
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            share.putExtra(Intent.EXTRA_TEXT, message);
            startActivity(Intent.createChooser(share, "Title of the dialog the system will open"));
        }
        else if (id == R.id.nav_send)
        {
            AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("Rating ");
            alert.setMessage("Please Give Rating For  My App");
            alert.setIcon(R.drawable.network_logo);
            alert.setPositiveButton("OK", null);
            alert.show();

        }
//
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
