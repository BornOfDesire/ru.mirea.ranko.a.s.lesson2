package ru.mirea.ranko.a.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    private String TAG = MainActivity.class.getSimpleName().toString();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =findViewById(R.id.message);
        textView = findViewById(R.id.ans);
    }
    public void onClick(View view){
        String textToInsert= editText.getText().toString();
        Integer Some = textToInsert.length();
        String another = Some.toString();
        textView.setText(another);
        Toast.makeText(getApplicationContext(), "СТУДЕНТ № 17, ГРУППА: БСБО-07-21, КОЛИЧЕСТВО СИМВОЛОВ:"+ textView.getText().toString(),
                Toast.LENGTH_LONG).show();

    }

}