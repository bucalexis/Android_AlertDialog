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

public class SingleChoiceListFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.pick_dish)
                .setItems(R.array.dish_array, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // The 'which' argument contains the index position
                        // of the selected item
                        Toast.makeText(getActivity(), "You clicked " + getResources().getStringArray(R.array.dish_array)[which], Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }
}