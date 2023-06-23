package com.example.cashcoachnew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView navBar;

    ProfileFragment profileFragment = new ProfileFragment();
    HomeFragment homeFragment = new HomeFragment();
    LearnFragment learnFragment = new LearnFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        navBar = findViewById(R.id.navBar);

        // Set initial navbar to home
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, homeFragment).commit();

        navBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.homeBtn)
                {
                    // Set navbar to home
                    getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, homeFragment).commit();
                    return true;
                }

                else if(item.getItemId() == R.id.learnBtn)
                {
                    // Set navbar to learn
                    getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, learnFragment).commit();
                    return true;
                }

                else if(item.getItemId() == R.id.accBtn)
                {
                    // Set navbar to account
                    getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, profileFragment).commit();
                    return true;
                }

                return false;
            }
        });
    }
}