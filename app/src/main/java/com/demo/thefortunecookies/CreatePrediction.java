package com.demo.thefortunecookies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        Log.i("TAG", "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "onDestroy");
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
            Toast.makeText(this, "Fill all fields please", Toast.LENGTH_SHORT).show();
        }
    }

    private String getPredictionByPosition(int position) {
        String[] prediction = getResources().getStringArray(R.array.description_of_prediction);
        return prediction[position];
    }
}