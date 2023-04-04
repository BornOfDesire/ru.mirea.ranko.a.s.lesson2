package com.example.rumirearankoaslesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.outText);
        Bundle extras = getIntent().getExtras();
        if (extras!=null){
            String value = extras.getString("key");
            textView.setText(value);
        }


    }
}