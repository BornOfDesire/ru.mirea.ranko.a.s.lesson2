package com.example.rumirearankoaslesson2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName().toString();
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =findViewById(R.id.editTextTextPersonName);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"OnStart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"OnPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"OnRestart");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String text=savedInstanceState.getString("data-value");
        Log.d(TAG,"SavedText: "+ text);
        if (text!=null)
            editText.setText(text);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"OnResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG,"Invoke onSaveInstanceState method"+editText.getText().toString());
        outState.putString("data_value",editText.getText().toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    public void InvokeSecondActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("key",editText.getText().toString());
        startActivity(intent);
    }
}