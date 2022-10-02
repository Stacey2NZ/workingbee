package com.example.workingbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final String LOGINTAG ="loginScreenTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button loginBtn = findViewById(R.id.loginBtnLogin);
        final Button exitBtn = findViewById(R.id.exitBtnLogin);

        // Code for login functions of checking if a user is selected, retrieving their data for next activity
        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TaskInfoInput.class);
                startActivity(i);
            }
        });

        // Code for Exit button to close app when clicked
        exitBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}