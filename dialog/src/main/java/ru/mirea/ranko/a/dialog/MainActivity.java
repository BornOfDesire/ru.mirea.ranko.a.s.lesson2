package ru.mirea.ranko.a.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialogTime(View view){
        String title = "Ваше время";
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss", Locale.UK);
        Date date = new Date();
        String message = String.valueOf(formatter.format(date.getTime())) + "?";
        String positivetext = "Верно)))";
        String negativetext = "Не-а";
        String asktext = "Что по времени?";

        String onClickedText = "Вы выбрали кнопку \"Что по времени?\"!";
        ThisDialogFragment TimeDialogFragment = new ThisDialogFragment(title,message,positivetext,negativetext,asktext,onClickedText);
        TimeDialogFragment.show(getSupportFragmentManager(), "Time");
    }
    public void onClickShowDialogDate(View view) {
        String title = "Ваша дата";

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.UK);
        Date date = new Date();
        String message = String.valueOf(formatter.format(date.getTime())) + "?";

        String positivetext = "Верно)))";
        String negativetext = "Не-а";
        String asktext = "Какой год??";

        String onClickedText = "Вы выбрали кнопку \"Какой год??\"!";

        ThisDialogFragment TimeDialogFragment = new ThisDialogFragment(title, message, positivetext, negativetext, asktext,  onClickedText);
        TimeDialogFragment.show(getSupportFragmentManager(), "Date");

    }

    public void onClickShowDialogProgress(View view) {
        String title = "Ваш прогресс";

        Random ra = new Random();
        int personProgress = ra.nextInt(100);

        String message = String.valueOf(personProgress) + "%";

        String positivetext = "Верно)))";
        String negativetext = "Не-а";
        String asktext = "Какой прогресс?";

        String onClickedText = "Вы выбрали кнопку \"Какой прогресс?\"!";

        ThisDialogFragment TimeDialogFragment = new ThisDialogFragment(title, message, positivetext, negativetext, asktext,  onClickedText);
        TimeDialogFragment.show(getSupportFragmentManager(), "Progress");
    }

    public void onOkClicked(String str) {
        Toast.makeText(getApplicationContext(), str,
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked(String str) {
        Toast.makeText(getApplicationContext(), str,
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked(String str) {
        Toast.makeText(getApplicationContext(), str,
                Toast.LENGTH_LONG).show();
    }
}