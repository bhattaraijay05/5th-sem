package com.example.appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
   }

   public void Submitorder(View view) {
       StringBuffer flavours = new StringBuffer().append(getString(R.string.flavours));
       CheckBox c1 = (CheckBox) findViewById(R.id.checkBox);
       CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
       CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);

       if(c1.isChecked())
       {
           flavours.append(getString(R.string.chocolate));
       }
       if(c2.isChecked())
       {
           flavours.append(getString(R.string.vanilla));
       }
       if(c3.isChecked())
       {
           flavours.append(getString(R.string.strawberry));
       }

       Toast.makeText(getApplicationContext(),flavours.toString(),Toast.LENGTH_LONG).show();
   }
}
