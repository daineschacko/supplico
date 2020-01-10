package com.example.supplico_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pdt_without_crd extends AppCompatActivity {
TextView pdtwhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdt_without_crd);
        pdtwhome=findViewById(R.id.back_home);
        pdtwhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pdt_without_crd.this,home.class));
            }
        });
    }
}
