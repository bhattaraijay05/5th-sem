package com.example.appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton android, java, angular, python;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android = (RadioButton)findViewById(R.id.rdbAndroid);
        angular = (RadioButton)findViewById(R.id.rdbAngular);
        java = (RadioButton)findViewById(R.id.rdbJava);
        python = (RadioButton)findViewById(R.id.rdbPython);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        String str="";
        switch(view.getId()) {
            case R.id.rdbAndroid:
                if(checked)
                    str = "Android Selected";
                break;
            case R.id.rdbAngular:
                if(checked)
                    str = "AngularJS Selected";
                break;
            case R.id.rdbJava:
                if(checked)
                    str = "Java Selected";
                break;
            case R.id.rdbPython:
                if(checked)
                    str = "Python Selected";
                break;
        }
//        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
