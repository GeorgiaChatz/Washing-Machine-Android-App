package com.example.gchatz.formobile;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ekseliksi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekseliksi);
        Button b1=(Button)findViewById(R.id.but2);
        Button b2=(Button)findViewById(R.id.but3);
        Button b3=(Button)findViewById(R.id.but4);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run(){
                Intent mInHome = new Intent(Ekseliksi.this, Oloklirwsi.class);
                Ekseliksi.this.startActivity(mInHome);
                Ekseliksi.this.finish();
            }
                            },5000);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ekseliksi.this, Oloklirwsi.class));
            }

        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ekseliksi.this, Oloklirwsi.class));
            }

        });

    }


    }

