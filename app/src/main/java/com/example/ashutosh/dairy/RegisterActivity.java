package com.example.ashutosh.dairy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText eAge =(EditText) findViewById(R.id.eAge);
        final EditText eName =(EditText) findViewById(R.id.eName);
        final EditText eUname =(EditText) findViewById(R.id.eUname);
        final EditText ePassword =(EditText) findViewById(R.id.ePassword);

        final Button Register =(Button) findViewById(R.id.Register);


    }
}
