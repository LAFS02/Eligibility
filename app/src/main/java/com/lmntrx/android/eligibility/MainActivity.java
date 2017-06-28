package com.lmntrx.android.eligibility;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void whenPressed(View view) {
        EditText et;
        et = (EditText) findViewById(R.id.ageet);
        int age=Integer.parseInt(et.getText().toString());
        if(age > 18){
            Toast.makeText(this, "you are eligible", Toast.LENGTH_SHORT).show();}
        else{
                Toast.makeText(this, "sorry!", Toast.LENGTH_SHORT).show();
            }
    }
}
