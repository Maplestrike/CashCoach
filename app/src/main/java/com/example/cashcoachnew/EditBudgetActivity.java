package com.example.cashcoachnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class EditBudgetActivity extends AppCompatActivity {

    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_budget);

        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(e -> {
            Intent intent = new Intent(EditBudgetActivity.this, BudgetPlanActivity.class);

            startActivity(intent);
            finish();
        });
    }
}