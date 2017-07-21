package com.example.ashutosh.dairy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainDairy extends AppCompatActivity {

    MainDairy saveMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dairy);
        saveMessage =(MainDairy) findViewById(R.id.saveMessage);


        }

        public void SaveMessage{View view}
        {
            String Message=  saveMessage.SaveMessage().toString();
            String file_name= "Dairy_File";
            FileOutputStream fileOutputStream = openFileOutput(file_name, MODE_PRIVATE);
            try {
                fileOutputStream.write(Message.getBytes());
                fileOutputStream.close();
                Toast.makeText(getApplicationContext(),"Message Saved", Toast.LENGTH_LONG).show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
