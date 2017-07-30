package com.example.ashutosh.dairy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);

        final EditText eUname =(EditText) findViewById(R.id.eUname);
        final EditText ePassword =(EditText) findViewById(R.id.ePassword);

        final Button Login =(Button) findViewById(R.id.login);
        final TextView registerLink =(TextView) findViewById(R.id.tvRegisterHere);
        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regiterIntent = new Intent(LoginRegister.this, RegisterActivity.class);
                LoginRegister.this.startActivity(regiterIntent);
            }
        });

    }
}
