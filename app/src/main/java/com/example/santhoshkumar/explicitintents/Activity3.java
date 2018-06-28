package com.example.santhoshkumar.explicitintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {

    Button b1;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
         editText = (EditText) findViewById(R.id.editText2);
         b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surname = editText.getText().toString();
                Intent intent = new Intent(Activity3.this,com.example.santhoshkumar.explicitintents.MainActivity.class);
                intent.putExtra("surname", surname);
                setResult(RESULT_OK,intent);
                Activity3.this.finish();
            }
        });
    }
}
