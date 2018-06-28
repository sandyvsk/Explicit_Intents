package com.example.santhoshkumar.explicitintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btn1, btn2;
    TextView textView;

    final int ACTIVITY = 3;


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String surname;

        //if (requestCode==ACTIVITY && requestCode == RESULT_OK) {
            surname = data.getStringExtra("surname");
            textView.setText(surname);
        //}

        //else if(requestCode==RESULT_CANCELED)
        {
        //    Toast.makeText(MainActivity.this, "Empty",Toast.LENGTH_SHORT).show();
        }

     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText) findViewById(R.id.etName);
        textView = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                Intent intent = new Intent(MainActivity.this, com.example.santhoshkumar.explicitintents.Activity2.class);
                intent.putExtra("username", name);
                startActivity(intent);
            }
        });

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, com.example.santhoshkumar.explicitintents.Activity3.class);
                startActivityForResult(intent,ACTIVITY);
             }
        });

    }
}
