package com.example.appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button b1;
    TextView sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addbtnclick(View view) {
        num1=findViewById(R.id.Firstno);
        num2=findViewById(R.id.Secondno);
        b1=findViewById(R.id.button);
        sum=findViewById(R.id.addbtn);
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int res=a+b;
        sum.setText(String.format("Sum = %d",res));
    }
}
