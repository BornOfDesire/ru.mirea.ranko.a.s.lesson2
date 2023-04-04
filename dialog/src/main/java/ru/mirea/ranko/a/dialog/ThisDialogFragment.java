package ru.mirea.ranko.a.dialog;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import java.util.Timer;
public class ThisDialogFragment extends DialogFragment {
    String title, message, positivebutton, negativebutton, askbutton, okstr,cancelstr, anotherstr;
    public ThisDialogFragment(String title,String message, String positivebutton, String negativebutton, String askbutton, String anotherstr){
        this.title = title;
        this.message = message;
        this.positivebutton = positivebutton;
        this.negativebutton = negativebutton;
        this.askbutton = askbutton;
        this.okstr = "Вы выбрали кнопку \"Правильно!\"!";
        this.cancelstr = "Вы выбрали кнопку\"Не-а\"!";
        this.anotherstr = anotherstr;
    }
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title)
                .setMessage(message)
                .setIcon(R.mipmap.ic_launcher_round)
                .setPositiveButton(askbutton, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    }
                })
                .setNeutralButton( positivebutton,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                ((MainActivity)getActivity()).onOkClicked(okstr);
                                dialog.cancel();
                            }
                        })
                .setNegativeButton(negativebutton,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                ((MainActivity)getActivity()).onCancelClicked(cancelstr);
                                dialog.cancel();
                            }
                        })
                .setPositiveButton(askbutton, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ((MainActivity)getActivity()).onNeutralClicked(anotherstr);
                        dialog.cancel();
                    }
                });
        return builder.create();
    }
}

