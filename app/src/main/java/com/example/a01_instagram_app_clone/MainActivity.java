package com.example.a01_instagram_app_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_instagram = (Button) findViewById(R.id.btn_instagram);
        btn_instagram.setOnClickListener(view -> openInstagram());

        Button btn_settings = (Button) findViewById(R.id.btn_settings);
        btn_settings.setOnClickListener(view -> openSettings());
    }

    public void openInstagram() {
        Intent intent = new Intent(this, InstagramActivity.class);
        startActivity(intent);
    }

    public void openSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}