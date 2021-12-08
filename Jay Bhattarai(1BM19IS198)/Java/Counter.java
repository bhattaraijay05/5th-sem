package com.example.appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button toast,count;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = findViewById(R.id.btn);
    count.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
            textview = findViewById(R.id.textView);
            String s = textview.getText().toString();
            int c = Integer.parseInt(s);
            c = c+1;
            textview.setText(""+c);
        }
    });


    }
    public void toastClick(View v){
        Toast.makeText(MainActivity.this, "Hello Welcome!", Toast.LENGTH_SHORT).show();
    }
//    public void Count(View v){
//        textview = findViewById(R.id.textView);
//        String s = textview.getText().toString();
//        int c = Integer.parseInt(s);
//        c = c+1;
//        textview.setText(c);
//
//    }
}

