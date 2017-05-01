package com.library.jeferson.dialogcustomtypes;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jeferson on 18/11/2016.
 */
public class DialogCustomUtil {

    public enum Type {
        CONFIRM,
        CANCEL,
        INFO;
    }

    public static Dialog dialog(final Context context, Type type, String title, String message, String labelConfirmButton, final View.OnClickListener confirmButton) {

        Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        switch (type) {
            case CONFIRM:
                dialog.setContentView(R.layout.dialog_custom_scl);
                break;
            case CANCEL:
                dialog.setContentView(R.layout.dialog_custom_scl_error);
                break;
            case INFO:
                dialog.setContentView(R.layout.dialog_custom_scl_info);
                break;
            default:
                dialog.setContentView(R.layout.dialog_custom_scl);
                break;
        }

        Button btnConfirm = (Button) dialog.findViewById(R.id.btn_send);
        TextView txtTitle = (TextView) dialog.findViewById(R.id.txt_title);
        TextView txt_msg = (TextView) dialog.findViewById(R.id.txt_msg);
        btnConfirm.setText(labelConfirmButton);
        txtTitle.setText(title);
        txt_msg.setText(message);
        btnConfirm.setOnClickListener(confirmButton);
        return dialog;
    }

    public static Dialog dialog(final Context context, Type type, String title, String message, String labelConfirmButton, String labelCancelButton, final View.OnClickListener confirmButton, final View.OnClickListener cancelButton) {

        Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        switch (type) {
            case CONFIRM:
                dialog.setContentView(R.layout.dialog_custom_scl);
                break;
            case CANCEL:
                dialog.setContentView(R.layout.dialog_custom_scl_error);
                break;
            case INFO:
                dialog.setContentView(R.layout.dialog_custom_scl_info);
                break;
            default:
                dialog.setContentView(R.layout.dialog_custom_scl);
                break;
        }
        Button btnConfirm = (Button) dialog.findViewById(R.id.btn_send);
        Button btnCancel = (Button) dialog.findViewById(R.id.btn_cancel);
        TextView txtTitle = (TextView) dialog.findViewById(R.id.txt_title);
        TextView txt_msg = (TextView) dialog.findViewById(R.id.txt_msg);

        btnCancel.setVisibility(View.VISIBLE);
        btnConfirm.setText(labelConfirmButton);
        btnCancel.setText(labelCancelButton);
        txtTitle.setText(title);
        txt_msg.setText(message);
        btnConfirm.setOnClickListener(confirmButton);
        btnCancel.setOnClickListener(cancelButton);
        return dialog;
    }



    public static Dialog dialogSucess(final Context context, String message) {

        final Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_custom_scl);
        Button btnConfirm = (Button) dialog.findViewById(R.id.btn_send);
        TextView txtTitle = (TextView) dialog.findViewById(R.id.txt_title);
        TextView txt_msg = (TextView) dialog.findViewById(R.id.txt_msg);
        btnConfirm.setText("OK");
        txtTitle.setText(context.getResources().getString(R.string.txt_sucess));
        txt_msg.setText(message);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        return dialog;
    }

    public static Dialog dialogSucess(final Context context, String title, String message) {

        final Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_custom_scl);
        Button btnConfirm = (Button) dialog.findViewById(R.id.btn_send);
        TextView txtTitle = (TextView) dialog.findViewById(R.id.txt_title);
        TextView txt_msg = (TextView) dialog.findViewById(R.id.txt_msg);
        btnConfirm.setText("OK");
        txtTitle.setText(title);
        txt_msg.setText(message);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        return dialog;
    }


    public static Dialog dialogError(final Context context, String message) {

        final Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_custom_scl_error);
        Button btnConfirm = (Button) dialog.findViewById(R.id.btn_send);
        TextView txtTitle = (TextView) dialog.findViewById(R.id.txt_title);
        TextView txt_msg = (TextView) dialog.findViewById(R.id.txt_msg);
        btnConfirm.setText("OK");
        txtTitle.setText(context.getResources().getString(R.string.txt_error));
        txt_msg.setText(message);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        return dialog;
    }

    public static Dialog dialogError(final Context context, String title, String message) {

        final Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_custom_scl_error);
        Button btnConfirm = (Button) dialog.findViewById(R.id.btn_send);
        TextView txtTitle = (TextView) dialog.findViewById(R.id.txt_title);
        TextView txt_msg = (TextView) dialog.findViewById(R.id.txt_msg);
        btnConfirm.setText("OK");
        txtTitle.setText(title);
        txt_msg.setText(message);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        return dialog;
    }

    public static Dialog dialogInfo(final Context context, String message) {

        final Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_custom_scl_info);
        Button btnConfirm = (Button) dialog.findViewById(R.id.btn_send);
        TextView txtTitle = (TextView) dialog.findViewById(R.id.txt_title);
        TextView txt_msg = (TextView) dialog.findViewById(R.id.txt_msg);
        btnConfirm.setText("OK");
        txtTitle.setText(context.getResources().getString(R.string.txt_info));
        txt_msg.setText(message);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        return dialog;
    }

    public static Dialog dialogInfo(final Context context, String title, String message) {

        final Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_custom_scl_info);
        Button btnConfirm = (Button) dialog.findViewById(R.id.btn_send);
        TextView txtTitle = (TextView) dialog.findViewById(R.id.txt_title);
        TextView txt_msg = (TextView) dialog.findViewById(R.id.txt_msg);
        btnConfirm.setText("OK");
        txtTitle.setText(title);
        txt_msg.setText(message);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        return dialog;
    }
}
