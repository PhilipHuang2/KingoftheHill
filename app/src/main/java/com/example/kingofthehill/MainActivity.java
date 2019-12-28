package com.example.kingofthehill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button legendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        legendButton = findViewById(R.id.legendButton);
        legendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLegend();
            }
        });
    }

    public void openLegend()
    {
        Intent intent = new Intent(this, LegendActivity.class);
        startActivity(intent);
    }
}
