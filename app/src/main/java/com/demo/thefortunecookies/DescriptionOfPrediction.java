package com.demo.thefortunecookies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DescriptionOfPrediction extends AppCompatActivity {
    private TextView prediction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_of_prediction);
        Intent intent = getIntent();
        prediction = findViewById(R.id.textViewPrediction);
        prediction.setText(intent.getStringExtra("name") + " " +    intent.getStringExtra("prediction"));

    }
}