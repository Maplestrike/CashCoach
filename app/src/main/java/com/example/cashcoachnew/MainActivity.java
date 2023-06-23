package com.example.cashcoachnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView loginHereLbl;

    EditText txtName, txtEmail, txtPass;
    CheckBox tncBox;

    Button regisBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginHereLbl = findViewById(R.id.loginHereLbl);

        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtPass = findViewById(R.id.txtPass);
        tncBox = findViewById(R.id.tncBox);

        regisBtn = findViewById(R.id.regisBtn);

        loginHereLbl.setOnClickListener(e -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        regisBtn.setOnClickListener(e -> {

            if(txtName.length() == 0)
            {
                Toast.makeText(this, "Name can not be empty!", Toast.LENGTH_SHORT).show();
                
            }
            else if (!txtEmail.getText().toString().contains("@"))
            {
                Toast.makeText(this, "Email must be in a correct format!", Toast.LENGTH_SHORT).show();
            }
            else if (txtPass.length() < 8)
            {
                Toast.makeText(this, "Password must be at least 8 characters long!", Toast.LENGTH_SHORT).show();
            }
            else if(tncBox.isChecked() == false)
            {
                Toast.makeText(this, "You must agree to the Terms and Conditions!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);

//                intent.putExtra(txtName.getText().toString(), "name");

                SharedPreferences.Editor editor = getSharedPreferences("MyPrefs", MODE_PRIVATE).edit();
                editor.putString("name", txtName.getText().toString());
                editor.putString("email", txtEmail.getText().toString());
                editor.putString("pass", txtPass.getText().toString());
                editor.apply();

                startActivity(intent);
                finish();
            }
        });

    }
}