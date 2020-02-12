package com.example.gchatz.formobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Vathmoi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vathmoi);
        RadioButton ASButton = (RadioButton) findViewById(R.id.radioButton);
        RadioButton ASB2 = (RadioButton)findViewById(R.id.radioButton2);
        ASButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Vathmoi.this, Euaisthita.class));
            }

        });
        ASB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Vathmoi.this, Euaisthita.class));
            }

        });


    }

}
