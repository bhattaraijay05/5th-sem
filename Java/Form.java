package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView t1,t2,t3;
    EditText fn,ln,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegister(View v){
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);

        b = findViewById(R.id.registe);
        fn = findViewById(R.id.fname);
        ln = findViewById(R.id.lname);
        email = findViewById(R.id.email);

        String f = fn.getText().toString();
        String l = ln.getText().toString();
        String e = email.getText().toString();

        t1.setText("First name : "+f);
        t2.setText("Last name : "+l);
        t3.setText("Email : "+e);
    }
}