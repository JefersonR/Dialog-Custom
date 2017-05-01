package com.library.jeferson.dialoglibrary;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.library.jeferson.dialogcustomtypes.DialogCustomUtil;

public class MainActivity extends AppCompatActivity {


    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = DialogCustomUtil.dialog(MainActivity.this, DialogCustomUtil.Type.CONFIRM, "OK", "Parabéns", "OK", "CANCELAR",
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                }, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
        dialog.show();
    }
}
