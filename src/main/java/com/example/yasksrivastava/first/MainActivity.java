package com.example.yasksrivastava.first;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void display(View v){
       String appName="";
       int id = v.getId();
       Button b = (Button)(findViewById(id));
       Toast.makeText(MainActivity.this,
               "This button will launch my "+b.getText()+" !", Toast.LENGTH_LONG).show();
   }
}
