package com.example.gchatz.formobile;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Proti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proti);

        Button btn1 = (Button) findViewById(R.id.but1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Proti.this, Plisi.class));
            }

        });


        Button btn2 = (Button) findViewById(R.id.but2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Proti.this, Help.class));
            }

        });



        Button btn3 = (Button) findViewById(R.id.but3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Proti.this, Rytmiseis.class));
            }

        });
    }
}
