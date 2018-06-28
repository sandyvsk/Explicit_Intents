package com.example.santhoshkumar.explicitintents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView etText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        String name = getIntent().getStringExtra("username");
        etText1 = (TextView) findViewById(R.id.textView2);
        etText1.setText(name + "welcome");
    }
}
