package com.example.scannmark;




import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;


import com.example.scannmark.about;
import com.google.firebase.auth.FirebaseAuth;

public class homepage extends AppCompatActivity {

    CardView imagesCard;
    CardView manual;
    CardView about;
    CardView logout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        imagesCard = findViewById(R.id.imageCard);  //qr
        manual=findViewById(R.id.manual);
        about = findViewById(R.id.about);
        logout = findViewById(R.id.logout);

        FirebaseAuth mAuth = FirebaseAuth.getInstance();  //for logout

        imagesCard.setOnClickListener(view -> {
            startActivity(new Intent(homepage.this, MainActivity.class));
        });

        manual.setOnClickListener(view -> {
            startActivity(new Intent(homepage.this, Manual.class));
        });

        logout.setOnClickListener(view -> {
            mAuth.signOut();
            homepage.this.finish();
            System.exit(0);
        });

        about.setOnClickListener(view -> {
            startActivity(new Intent(homepage.this, com.example.scannmark.about.class));
        });


    }
}