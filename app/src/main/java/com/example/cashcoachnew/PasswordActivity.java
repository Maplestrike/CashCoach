package com.example.cashcoachnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class PasswordActivity extends AppCompatActivity {

    ImageView backBtn;

    Button proceedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        backBtn = findViewById(R.id.backBtn);
        proceedBtn = findViewById(R.id.proceedBtn);

        backBtn.setOnClickListener(e -> {
            Intent intent = new Intent(PasswordActivity.this, HomeActivity.class);

            startActivity(intent);
            finish();
        });

        proceedBtn.setOnClickListener(e -> {
            Intent intent = new Intent(PasswordActivity.this, FinancialDetailsScreen.class);

            startActivity(intent);
            finish();
        });

    }
}