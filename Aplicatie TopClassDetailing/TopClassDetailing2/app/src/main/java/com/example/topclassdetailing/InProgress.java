package com.example.topclassdetailing;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InProgress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_progress);

        Button buttonInapoi3 = findViewById(R.id.InapoiInMeniuPrincipal);
        buttonInapoi3.setOnClickListener(v -> {
            Intent intent = new Intent(this, Meniul_Principal.class);
            startActivity(intent);
        });
    }
}