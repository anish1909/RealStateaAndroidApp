package com.example.user.realstateapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Front extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
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
        getMenuInflater().inflate(R.menu.front, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.viewgallery) {
            Intent intent=new Intent(Front.this,Gallery.class);
            startActivity(intent);

        } else if (id == R.id.locations) {
            Intent intent=new Intent(Front.this,Locations.class);
            startActivity(intent);


        } else if (id == R.id.testimonials) {
            Intent intent=new Intent(Front.this,Testimonial.class);
            startActivity(intent);

        } else if (id == R.id.contactus) {
            Intent intent=new Intent(Front.this,Conatctus.class);
            startActivity(intent);

        }
        else if (id == R.id.connecttous) {
            Intent intent=new Intent(Front.this,ConnectToUS.class);
            startActivity(intent);
        }

        else if (id == R.id.feedback)
        {
                Intent intent=new Intent(Front.this,Feedback.class);
                startActivity(intent);
        }
                  else if (id == R.id.rateus) {
                    Intent intent=new Intent(Front.this,RateUs.class);
                    startActivity(intent);

        }else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void gallery(View view){
        Intent intent=new Intent(Front.this,Gallery.class);
        startActivity(intent);


    }
    public void locations(View view){
        Intent intent=new Intent(Front.this,Locations.class);
        startActivity(intent);


    }
    public void testimonials(View view){
        Intent intent=new Intent(Front.this,Testimonial.class);
        startActivity(intent);


    }
    public void contactus(View view){
        Intent intent=new Intent(Front.this,Conatctus.class);
        startActivity(intent);

    }



}
