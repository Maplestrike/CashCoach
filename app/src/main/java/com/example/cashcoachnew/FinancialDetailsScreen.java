package com.example.cashcoachnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FinancialDetailsScreen extends AppCompatActivity {

    ImageView backBtn;

    TextView viewBudgetPlanBtn;

    Button addEarnedBtn, addSpentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_details_screen);

        backBtn = findViewById(R.id.backBtn);

        viewBudgetPlanBtn = findViewById(R.id.viewBudgetPlanBtn);

        addEarnedBtn = findViewById(R.id.addEarnedBtn);
        addSpentBtn = findViewById(R.id.addSpentBtn);

        backBtn.setOnClickListener(e -> {
            Intent intent = new Intent(FinancialDetailsScreen.this, HomeActivity.class);

            startActivity(intent);
            finish();
        });

        viewBudgetPlanBtn.setOnClickListener(e -> {
            Intent intent = new Intent(FinancialDetailsScreen.this, BudgetPlanActivity.class);

            startActivity(intent);
            finish();
        });

        addEarnedBtn.setOnClickListener(e -> {
            Intent intent = new Intent(FinancialDetailsScreen.this, AddEarnedActivity.class);

            startActivity(intent);
            finish();
        });

        addSpentBtn.setOnClickListener(e -> {
            Intent intent = new Intent(FinancialDetailsScreen.this, AddSpentActivity.class);

            startActivity(intent);
            finish();
        });
    }
}