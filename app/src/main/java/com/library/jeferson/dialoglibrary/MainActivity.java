package com.library.jeferson.dialoglibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.library.jeferson.dialogcustomtypes.DialogCustomUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        DialogCustomUtil.dialog(MainActivity.this, DialogCustomUtil.Type.CONFIRM,"DEU CERTO","BELEZA uhauhsu hauhs au hs ajksh ajkhsaui hskj ah shaks kajhsk nakjshakuj sa","OK","CANCELAR",
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.e("TESTE", "LEGAL");
                    }
                },new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.e("TESTE 2", "LEGAL 3");
                    }
                }).show();
    }
}
