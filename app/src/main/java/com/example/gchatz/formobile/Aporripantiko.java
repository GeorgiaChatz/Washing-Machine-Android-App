package com.example.gchatz.formobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Aporripantiko extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aporripantiko);
        Button btn1 = (Button) findViewById(R.id.but1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Aporripantiko.this, Topothetisi.class));


            }

        });

        Button btn2 = (Button) findViewById(R.id.but2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Aporripantiko.this, Topothetisi.class));
            }

        });

        TextView tv1 = (TextView) findViewById(R.id.tv1);
    }
    }
