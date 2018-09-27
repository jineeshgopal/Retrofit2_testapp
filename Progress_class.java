package com.example.spericorn.retrofit2_testapp;


import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.WindowManager;

public class Progress_class {
    ProgressDialog progressDialog;

    public static ProgressDialog createProgressDialog(Context mContext) {
        ProgressDialog dialog = new ProgressDialog(mContext);
        try {
            dialog.show();
        } catch (WindowManager.BadTokenException e) {

        }

        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        // dialog.getWindow().setBackgroundDrawableResource(R.drawable.appicon);
        dialog.setContentView(R.layout.progressdialog);
        return dialog;
    }
}
