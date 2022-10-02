package com.example.workingbee;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import java.util.Calendar;


public class TaskInfoInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_info_input);

        final String TAG = "TaskInput";
        final Button backBtn = findViewById(R.id.backBtnTaskInput);
        final Button exitBtn = findViewById(R.id.exitBtnTaskInput);
        final Button saveBtn = findViewById(R.id.saveBtnTaskInput);
        int minutesTotal;

        Calendar c = Calendar.getInstance();

        TimePicker picker1;
        TimePicker picker2;
        picker1 = (TimePicker)findViewById(R.id.timepicker1);
        picker1.setIs24HourView(true);
        picker2 = (TimePicker)findViewById(R.id.timePicker2);
        picker2.setIs24HourView(true);

        //Code for save button which calculates time difference and adds task, time taken in minutes is recorded along with task and the user in database.
        saveBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int hour1, minute1;
                int hour2, minute2;
                if (Build.VERSION.SDK_INT > 23) {
                    hour1 = picker1.getHour();
                    minute1 = picker1.getMinute();

                }
                else {
                    hour1 = picker1.getCurrentHour();
                    minute1 = picker1.getCurrentMinute();
                }
                if(Build.VERSION.SDK_INT > 23) {
                    hour2 = picker2.getHour();
                    minute2 = picker2.getMinute();
                }
                else {
                    hour2 = picker2.getCurrentHour();
                    minute2 = picker2.getCurrentMinute();
                }
                //The following value gets the start time in minutes from 00:00
                int picker1mins = (hour1*60) + minute1;
                //The following value gets the finish time in minutes from 00:00
                int picker2mins = (hour2*60) + minute2;
                //The following value calculates the time in minutes from picker1mins and picker2mins
                int totalMins = picker2mins - picker1mins;
                String s = Integer.toString(totalMins);
                Log.d(TAG,s);
                if (totalMins > 0) {
                    //instantiating the alert for save confirmation
                    AlertDialog.Builder builder = new AlertDialog.Builder(TaskInfoInput.this);
                    //Setting the characteristics
                    builder.setMessage("Done!");
                    //Get the AlertDialog
                    AlertDialog dialog = builder.create();
                    //Show the dialog
                    dialog.show();
                }
                else {
                    //instantiating the alert for error message
                    AlertDialog.Builder builder = new AlertDialog.Builder(TaskInfoInput.this);
                    //Setting the characteristics
                    builder.setMessage("Check your times and try again");
                    //Get the AlertDialog
                    AlertDialog dialog = builder.create();
                    //Show the dialog
                    dialog.show();
                }

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
                finishAffinity();
            }
        });
    }
}