package com.example.cashcoachnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class AddEarnedActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView backBtn;
    Spinner catEarnedSpn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_earned);

        backBtn = findViewById(R.id.backBtn);
        catEarnedSpn = findViewById(R.id.catEarnedSpn);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.earnedCats, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        catEarnedSpn.setAdapter(adapter);
        catEarnedSpn.setOnItemSelectedListener(this);

        backBtn.setOnClickListener(e -> {
            Intent intent = new Intent(AddEarnedActivity.this, FinancialDetailsScreen.class);

            startActivity(intent);
            finish();
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}