package com.example.user.realstateapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    EditText et1,et2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.sign2);
    }
    public void login(View view)
    {
        String email=et1.getText().toString();
        String password=et2.getText().toString();
        String Email="as0160895@gmail.com";
        String Email1="jnmishra280198@gmail.com";
        String Password="anish@1909";
        String Password1="jay@280198";
        if(email.equals(Email)&&(password.equals(Password))||(email.equals(Email1)&&(password.equals(Password1))))
        {
            Toast.makeText(this, "YOU ARE LOGGED IN", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Make SURE your password is correct", Toast.LENGTH_SHORT).show();

        }
        Intent intent=new Intent(LogIn.this,Front.class);
        startActivity(intent);


    }
    public void signin(View view)
    {
        startActivity(new Intent(LogIn.this,Registration.class));
    }
}
