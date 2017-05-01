package com.library.jeferson.dialoglibrary;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.library.jeferson.dialogcustomtypes.DialogCustomUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button confirm;
    private Button confirmCancel;
    private Button sucess;
    private Button error;
    private Button info;
    private Dialog dialog;

    private void findViews() {
        confirm = (Button)findViewById( R.id.confirm );
        confirmCancel = (Button)findViewById( R.id.confirm_cancel );
        sucess = (Button)findViewById( R.id.sucess );
        error = (Button)findViewById( R.id.error );
        info = (Button)findViewById( R.id.info );

        confirm.setOnClickListener( this );
        confirmCancel.setOnClickListener( this );
        sucess.setOnClickListener( this );
        error.setOnClickListener( this );
        info.setOnClickListener( this );
    }


    @Override
    public void onClick(View v) {
        if ( v == confirm ) {
            dialogConfirm();
        } else if ( v == confirmCancel ) {
            dialogConfirmCancel();
        } else if ( v == sucess ) {
            dialogSucess();
        } else if ( v == error ) {
            dialogError();
        } else if ( v == info ) {
            dialogInfo();
        }
    }

    public void dialogConfirm(){
        dialog = DialogCustomUtil.dialog(MainActivity.this, DialogCustomUtil.Type.CONFIRM, "OK", "Cadastro executado com sucesso", "OK",
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
        dialog.show();
    }

    public void dialogConfirmCancel(){
        dialog = DialogCustomUtil.dialog(MainActivity.this, DialogCustomUtil.Type.CANCEL, "Excluir", "Tem certeza que deseja excluir essa informação?", "OK", "CANCELAR",
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

    public void dialogSucess(){
        DialogCustomUtil.dialogSucess(MainActivity.this, "Requisição executada com sucesso.").show();
    }

    public void dialogError(){
        DialogCustomUtil.dialogError(MainActivity.this, "Falha na execução da requisição.").show();
    }

    public void dialogInfo(){
        DialogCustomUtil.dialogInfo(MainActivity.this, "Tem certeza que deseja continuar.").show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();


    }
}
