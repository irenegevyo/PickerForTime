package com.example.android.pickerfortime;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.gevyo.android.pickerfortime.R;
import com.gevyo.android.pickerfortime.TimePickerFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTimePicker(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        // ubah waktu ke string
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        // string ke timemessage
        String timeMessage = (hour_string + ":" + minute_string);

        Toast.makeText(this,"TimeToast"
                + timeMessage, Toast.LENGTH_SHORT).show();
    }
}