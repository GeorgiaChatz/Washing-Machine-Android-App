package com.example.gchatz.formobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Malaktiko extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaktiko);
        TextView tv1 = (TextView) findViewById(R.id.tv1);

        ImageButton ib1 = (ImageButton) findViewById(R.id.imageButton);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Malaktiko.this, TopothetisiMal.class));
            }
        });
        ImageButton ib2 = (ImageButton) findViewById(R.id.imageButton3);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Malaktiko.this, Fast.class));
            }
        });
    }
}
