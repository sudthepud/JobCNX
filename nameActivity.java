package com.example.jobcnx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import java.util.Scanner;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nameActivity extends AppCompatActivity {
    public Scanner scan;
    public String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_name);

        mButton = (Button)findViewById(R.id.button);
        mEdit = (EditText)findViewById(R.id.edittext);

        mButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        name = Log.v("EditText", mEdit.getText().toString());
                        final Intent i =new Intent(nameActivity.this, emailActivity.class);
                    }
                });
    }
}