package com.example.supplico_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class home extends AppCompatActivity {
TextView withcard,withoutcard,logt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        withcard=findViewById(R.id.buy_card_text);
        withoutcard=findViewById(R.id.prdtwithout_card);
        withcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this,pdt_card.class));
            }
        });
        withoutcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this,pdt_without_crd.class));
            }
        });
        logt=findViewById(R.id.log_out);
        logt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this,MainActivity.class));
            }
        });

    }
}
