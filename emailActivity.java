package com.example.jobcnx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import java.util.Scanner;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class emailActivity extends AppCompatActivity {
    public String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        mButton = (Button)findViewById(R.id.button);
        mEdit = (EditText)findViewById(R.id.edittext);

        mButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        email = Log.v("EditText", mEdit.getText().toString());
                        final Intent i =new Intent(emailActivity.this, fieldActivity.class);
                    }
                });
    }
}