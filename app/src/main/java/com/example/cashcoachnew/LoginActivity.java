package com.example.cashcoachnew;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    TextView regisHereLbl;

    Button loginBtn;

    EditText txtEmail, txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        regisHereLbl = findViewById(R.id.regisHereLbl);
        txtEmail = findViewById(R.id.txtEmail);
        txtPass = findViewById(R.id.txtPass);

        loginBtn = findViewById(R.id.loginBtn);

        regisHereLbl.setOnClickListener(e -> {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);

            startActivity(intent);
            finish();
        });

        loginBtn.setOnClickListener(e -> {

            SharedPreferences prefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

            String email = prefs.getString("email", null);
            String pass = prefs.getString("pass", null);

            if(!email.equals(txtEmail.getText().toString()) || !pass.equals(txtPass.getText().toString()))
            {
                Toast.makeText(this, "User not found! Please check your email or password.", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}