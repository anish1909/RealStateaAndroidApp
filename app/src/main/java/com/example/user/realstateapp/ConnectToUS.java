package com.example.user.realstateapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ConnectToUS extends AppCompatActivity {
    ImageButton i1,i2,i3,i4,i5,i6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_to_us);
        i1=(ImageButton)findViewById(R.id.imageButton);
        i2=(ImageButton)findViewById(R.id.imageButton2);
        i3=(ImageButton)findViewById(R.id.imageButton3);
        i4=(ImageButton)findViewById(R.id.imageButton4);
        i5=(ImageButton)findViewById(R.id.imageButton5);
        i6=(ImageButton)findViewById(R.id.imageButton6);



    }
    public void call(View view)
    {
        Intent intent=new Intent((Intent.ACTION_DIAL));
        intent.setData(Uri.parse("tel:9935208629"));
        startActivity(intent);
    }
    public void fbcon(View view)
    {
        Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/anishkumar.srivastav.73"));
        startActivity(intent);

    }
    public void gmsg(View view)

    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/u/0/photos/108574645060289376902/albums/profile/6401507754997109074?iso=false"));
        startActivity(intent);
    }


    public void linmsg(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/anish-kumar-srivastava-293479138/"));
        startActivity(intent);
    }

    public void twitmsg (View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/SriAs0160895"));
        startActivity(intent);
    }
    public void instamsg (View view)
    {

    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/anishkumarsrivastav/?hl=en"));
    startActivity(intent);
}




}
