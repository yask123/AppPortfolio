package com.example.yasksrivastava.first;

import android.content.Context;
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

       int id = v.getId();
       Button b = (Button)(findViewById(id));

       Context context = getApplicationContext();
       CharSequence text = "This button will launch my "+b.getText()+" !";
       int duration = Toast.LENGTH_SHORT;

       Toast toast = Toast.makeText(context, text, duration);
       toast.show();
   }
}
