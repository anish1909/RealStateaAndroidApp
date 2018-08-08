package com.example.user.realstateapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Feedback extends AppCompatActivity {
    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback2);
        e1=(EditText)findViewById(R.id.editTextf2);
        e2=(EditText)findViewById(R.id.edittextf2);
    }
    public void feedback(View view)
    {
        String [] to={"as0160895@gmail.com","anishkumarsrivastav1909@gmail.com"};
        String name=e1.getText().toString();
        String message=e2.getText().toString();
        Intent intent=new Intent((Intent.ACTION_SEND));
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL,to);
        intent.putExtra(Intent.EXTRA_TEXT,"message"+"\n"+e1.getText().toString());
        intent.setType("message/rfrc82");
        Intent chooser=Intent.createChooser(intent,"Send Email");
        startActivity(intent);
    }
}
