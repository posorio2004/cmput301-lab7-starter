package com.example.androiduitesting;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class OtherActivity extends AppCompatActivity {

    String name;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        name = getIntent().getStringExtra("Name");

        TextView CityName = findViewById(R.id.CityName);
        CityName.setText(name);


        final Button BackButton = findViewById(R.id.BackButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}