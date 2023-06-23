package com.example.cashcoachnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class BudgetPlanActivity extends AppCompatActivity {

    ImageView backBtn, foodBdgEditBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_plan);

        backBtn = findViewById(R.id.backBtn);

        foodBdgEditBtn = findViewById(R.id.foodBdgEditBtn);

        backBtn.setOnClickListener(e -> {
            Intent intent = new Intent(BudgetPlanActivity.this, HomeActivity.class);

            startActivity(intent);
            finish();
        });

        foodBdgEditBtn.setOnClickListener(e -> {
            Intent intent = new Intent(BudgetPlanActivity.this, EditBudgetActivity.class);

            startActivity(intent);
            finish();
        });
    }
}