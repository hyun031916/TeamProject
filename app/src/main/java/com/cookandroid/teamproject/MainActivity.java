package com.cookandroid.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView idText = (TextView) findViewById(R.id.idText);
        TextView passwordText = (TextView) findViewById(R.id.passwordText);
        TextView welcome = (TextView) findViewById(R.id.WelcomeMessage);



//        EditText edit1 = (EditText) findViewById(R.id.edit1);
//        EditText edit2 = (EditText) findViewById(R.id.edit2);
//        Button loginbtn = (Button) findViewById(R.id.loginbtn);
//        TextView registerbtn = (TextView) findViewById(R.id.registerbtn);
    }
}