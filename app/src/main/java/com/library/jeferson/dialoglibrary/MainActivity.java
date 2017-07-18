package com.library.jeferson.dialoglibrary;


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
        DialogCustomUtil.dialog(MainActivity.this, getString(R.string.txt_title), getString(R.string.txt_message), new DialogCustomUtil.OnItemClick() {
            @Override
            public void onItemClick(View view) {
                //Do something
            }
        });
    }

    public void dialogConfirmCancel(){
        DialogCustomUtil.dialog(MainActivity.this, getString(R.string.txt_title), getString(R.string.txt_message), new DialogCustomUtil.OnItemClick() {
            @Override
            public void onItemClick(View view) {
                //Do something
            }
        }, new DialogCustomUtil.OnItemClick() {
            @Override
            public void onItemClick(View view) {
                //Do something

            }
        });
    }

    public void dialogSucess(){
        DialogCustomUtil.dialog(MainActivity.this, getString(R.string.txt_message));
    }

    public void dialogError(){
        DialogCustomUtil.dialog(MainActivity.this, getString(R.string.txt_title), getString(R.string.txt_message),getString(R.string.txt_try_again), getString(R.string.txt_cancel), new DialogCustomUtil.OnItemClick() {
            @Override
            public void onItemClick(View view) {
                //Do something
            }
        }, new DialogCustomUtil.OnItemClick() {
            @Override
            public void onItemClick(View view) {
                //Do something
            }
        });
    }
    public void dialogInfo(){
        DialogCustomUtil.dialog(MainActivity.this,getString(R.string.txt_info), getString(R.string.txt_message), getString(R.string.txt_got_it));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();


    }
}
