package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        RadioGroup rGroup = (RadioGroup) findViewById(R.id.rGroup);
//        Button button = (Button) findViewById(R.id.submitButton);
//        TextView res = (TextView) findViewById(R.id.result);
//        button.setOnClickListener(v -> {
//            int selectedId = rGroup.getCheckedRadioButtonId();
//            RadioButton selected = (RadioButton)rGroup.findViewById(selectedId);
//            if (selectedId == -1){
//                Toast.makeText(getApplicationContext(), "Nothing is selected" , Toast.LENGTH_SHORT).show();
//            }else{
//                Toast.makeText(getApplicationContext(), selected.getText() , Toast.LENGTH_SHORT).show();
//            }
//        });

        Button button = (Button) findViewById(R.id.change);
        DatePicker dp = (DatePicker) findViewById(R.id.datePicker);

        button.setOnClickListener(v -> {
              int day = dp.getDayOfMonth();
              int month = dp.getMonth();
              Toast.makeText(getApplicationContext(), String.valueOf(day) + " " +   String.valueOf(month), Toast.LENGTH_SHORT).show();
        });
    }
}