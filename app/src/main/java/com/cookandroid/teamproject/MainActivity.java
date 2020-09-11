package com.cookandroid.teamproject;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static android.icu.number.NumberFormatter.with;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView idText = (TextView) findViewById(R.id.idText);
//        TextView passwordText = (TextView) findViewById(R.id.passwordText);
        TextView welcome = (TextView) findViewById(R.id.WelcomeMessage);

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });



//        EditText edit1 = (EditText) findViewById(R.id.edit1);
//        EditText edit2 = (EditText) findViewById(R.id.edit2);
//        Button loginbtn = (Button) findViewById(R.id.loginbtn);
//        TextView registerbtn = (TextView) findViewById(R.id.registerbtn);
    }
}