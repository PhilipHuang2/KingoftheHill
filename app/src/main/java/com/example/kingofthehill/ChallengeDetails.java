package com.example.kingofthehill;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class ChallengeDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_details);
        Toolbar toolbar = findViewById(R.id.Challenge_Detail_Menu);
        setSupportActionBar(toolbar);

    }

}
