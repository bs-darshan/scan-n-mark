package com.example.scannmark;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Manual extends AppCompatActivity {


    TextView steps;
    ImageView github;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        steps=findViewById(R.id.steps);
        github=findViewById(R.id.github);
        github.setOnClickListener(view -> {Intent githublink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/bs-darshan/scan-n-mark.git"));
            startActivity(githublink);
        });





        String s = "Welcome to Scan N Mark\n\n" +
                "I would like to inform you The application is currently in a stable and operational state. however, it requires customization to align with your specific origination requirements.\n\n"+
                "It is possible to customize the application to your specific needs by accessing the source code via GitHub.\n\n"+
                "To obtain your own copy, kindly follow the provided link or visit our GitHub repository or $git clone https://github.com/bs-darshan/scan-n-mark.git  \n\n\n"+
                "NOTE:\n#1.Scan N Mark utilizes Firebase on the backend for storing attendance data and integrates with third-party QR scanner services,Later you can customize your preferred service providers."+
                "\n#2.Candidates are required to exclusively use the specific user email IDs provided by the organization, which serve as the basis for marking attendance. For additional information regarding design and functionality, \n"+
                "please visit our GitHub repository\n" +
                "\n\nI am pleased to welcome suggestions. Please feel free to reach out to me with any input or recommendations.\nat contact.logicwave@gmail.com";


        steps.setText(s);


        steps.setMovementMethod(new ScrollingMovementMethod());
    }
}
