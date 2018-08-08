package com.example.user.realstateapp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RateUs extends AppCompatActivity  {
    Button b1;
   EditText t1;
    RatingBar ratingBar;
  ConstraintLayout constraintLayout;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);
        b1 = (Button) findViewById(R.id.rbb);
        t1 = (EditText) findViewById(R.id.tvr2);
        constraintLayout=(ConstraintLayout)findViewById(R.id.rateuslay);

        animationDrawable=(AnimationDrawable)constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(RateUs.this, "you Rated", Toast.LENGTH_SHORT).show();
                t1.setText(String.valueOf(rating));


            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] to={"as0160895@gmail.com","anishkumarsrivastav1909@gmail.com"};

                Intent intent=new Intent((Intent.ACTION_SEND));
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_TEXT,"you have rated us"+ t1.getText().toString());
                intent.setType("message/rfrc82");
                Intent chooser=Intent.createChooser(intent,"Send Email");
                startActivity(intent);
                Toast.makeText(RateUs.this, "thanx for rating us", Toast.LENGTH_SHORT).show();

            }
        });

    }
    }





