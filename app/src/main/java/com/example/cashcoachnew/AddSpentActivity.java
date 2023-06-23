package com.example.cashcoachnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class AddSpentActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView backBtn;
    Spinner catSpentSpn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_spent);

        backBtn = findViewById(R.id.backBtn);
        catSpentSpn = findViewById(R.id.catSpentSpn);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spentCats, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        catSpentSpn.setAdapter(adapter);
        catSpentSpn.setOnItemSelectedListener(this);

        backBtn.setOnClickListener(e -> {
            Intent intent = new Intent(AddSpentActivity.this, FinancialDetailsScreen.class);

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