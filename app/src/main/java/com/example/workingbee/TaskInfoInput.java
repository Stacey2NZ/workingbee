package com.example.workingbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TaskInfoInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_info_input);

        final Button backBtn = findViewById(R.id.backBtnTaskInput);
        final Button exitBtn = findViewById(R.id.exitBtnTaskInput);
        final Button saveBtn = findViewById(R.id.saveBtnTaskInput);
        int minutesTotal;
        String timex, timey;

        //Code for save button which calculates time difference and adds task, time taken in minutes is recorded along with task and the user in database.
        saveBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

            }
        });

        //Code for Back button to close this screen and return to MainActivity
        backBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
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