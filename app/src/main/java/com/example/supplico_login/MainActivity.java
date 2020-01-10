package com.example.supplico_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button signup,signin;
    TextView forpass;
    EditText uname,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=findViewById(R.id.et_enter_email);
        pass=findViewById(R.id.et_enter_pass);
        signup=findViewById(R.id.bt_sign_up);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,reg.class));
            }
        });
        forpass=findViewById(R.id.fpass);
        forpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,forgtpass.class));
            }
        });
        signin=findViewById(R.id.bt_sign_in);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (uname.getText().toString().equals("admin@gmail.com")&&pass.getText().toString().equals("admin")) {
                    startActivity(new Intent(MainActivity.this, admin_home.class));
                }
                if (uname.getText().toString().equals("")&&pass.getText().toString().equals("")){
                    startActivity(new Intent(MainActivity.this,home.class));
                }
                else{
                    Toast.makeText(MainActivity.this,"invalid Email or Password",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
