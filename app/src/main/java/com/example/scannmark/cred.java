package com.example.scannmark;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class cred extends AppCompatActivity {
    TextView cred;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cred);

        cred=findViewById(R.id.cred);






        String c= "For temporary login use credentials\n\n" +
                "email : contact.logicwave@gmail.com\n" +
                "password : demo123" +
                "\n\n" +
                "Note: further credentials can be managed with the user requirements (refer user manual page after login)" ;

                cred.setText(c);
    }
}