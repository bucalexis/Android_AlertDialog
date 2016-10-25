package com.example.bucalexis.android_alertdialog;

/**
 * Created by NanX3 on 24/10/2016.
 */

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

public class ThreeButtonFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.dialog_three_button)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(),"You clicked Yes <img draggable='false' class='emoji' alt='🙂' src='https://s.w.org/images/core/emoji/2/svg/1f642.svg'> !! \n You will Get Latest Updates ",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(),"You clicked No <img draggable='false' class='emoji' alt='🙁' src='https://s.w.org/images/core/emoji/2/svg/1f641.svg'> !! \n Please subscribe to Get Latest Updates ",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton(R.string.remind, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(),"You clicked Remind Me Later !! \n We will Remind you later ",Toast.LENGTH_SHORT).show();
                    }
                });

        return builder.create();
    }
}