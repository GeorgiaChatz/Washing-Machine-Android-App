package com.example.gchatz.formobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Plisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plisi);
        Button btn1 = (Button) findViewById(R.id.but2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plisi.this, Bambakera.class));
            }

        });

        Button btn2 = (Button)findViewById(R.id.but1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plisi.this, Euaisthita.class));
            }

        });
        Button btn3 = (Button)findViewById(R.id.but3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plisi.this, Leuka.class));
            }

        });
        Button btn4 = (Button)findViewById(R.id.but4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Plisi.this, Xromatista.class));
            }

        });
    }
}
