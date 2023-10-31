package com.example.scannmark;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class about extends AppCompatActivity {
    TextView abouttext;
    TextView owner;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        abouttext=findViewById(R.id.abouttext);
        owner=findViewById(R.id.Darshan_BS);

        String d="By Darshan BS";

        owner.setText(d);

        String a= "\"Scan N Mark, An attempt to simplifying attendance management for educators, " +
                "event organizers, and businesses. Our user-friendly Android app leverages QR code technology to streamline the process, " +
                "ensuring accuracy, efficiency, and safety. Whether it's a classroom, seminar, conference, or corporate event, " +
                "we're here to transform attendance tracking into a hassle-free experience. Join us in the digital revolution of attendance management." +
                "\n\nI am pleased to welcome suggestions. Please feel free to reach out to me with any input or recommendations.\n at contact.logicwave@gmail.com";
        abouttext.setText(a);


        abouttext.setMovementMethod(new ScrollingMovementMethod());


    }
}