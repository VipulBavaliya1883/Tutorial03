package com.example.tutorial03;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view) {

        EditText et1 = findViewById(R.id.etusername);
        EditText et2 = findViewById(R.id.etpassword);
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();

        if (s1.equals("admin@gmail.com") && s2.equals("admin")) {
            Intent a1 = new Intent(this, Welcome.class);
            startActivity(a1);
        }
        else {
            Toast.makeText(this, "Username and Password Incorrect!!!", Toast.LENGTH_SHORT).show();
        }
    }
}