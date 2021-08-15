package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        //String s1 = getIntent().getStringExtra("username");
        //String s2 = getIntent().getStringExtra("password");

        //TextView t1 = (TextView)findViewById(R.id.tvusername);
        //TextView t2 = (TextView)findViewById(R.id.tvpassword);

        //t1.setText(s1);
        //t2.setText(s2);

    }
}