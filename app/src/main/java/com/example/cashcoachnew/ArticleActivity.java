package com.example.cashcoachnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class ArticleActivity extends AppCompatActivity {

    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(e -> {
            Intent intent = new Intent(ArticleActivity.this, HomeActivity.class);

            startActivity(intent);
            finish();
        });

    }
}