package com.demo.thefortunecookies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class CreatePrediction extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextAge;
    private int age;
    private String name;
    private String prediction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.editTextTextPersonName);
        editTextAge = findViewById(R.id.editTextAge);

    }


    public void getPrediction(View view) {
        if (editTextName.length() != 0 && editTextAge.length() != 0) {
            name = editTextName.getText().toString();
            age = Integer.parseInt(editTextAge.getText().toString());
            age = age%10;
            prediction = getPredictionByPosition(age);
            Log.i("qaz", prediction);
            Intent intent = new Intent(this, DescriptionOfPrediction.class);
            intent.putExtra("prediction", prediction );
            intent.putExtra("name", name);
            startActivity(intent);
        } else {

        }
    }

    private String getPredictionByPosition(int position) {
        String[] prediction = getResources().getStringArray(R.array.description_of_prediction);
        return prediction[position];
    }
}