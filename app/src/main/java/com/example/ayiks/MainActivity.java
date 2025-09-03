package com.example.ayiks;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button connectButton = findViewById(R.id.connectButton);
        Button setPinButton = findViewById(R.id.setPinButton);
        Button settingsButton = findViewById(R.id.settingsButton);

        connectButton.setOnClickListener(v -> {
            // TODO: Implement Connect to Target functionality
            // Example: Start a new activity or initiate a WebRTC connection
        });

        setPinButton.setOnClickListener(v -> {
            // Start the PinActivity
            Intent intent = new Intent(this, PinActivity.class);
            startActivity(intent);
        });

        settingsButton.setOnClickListener(v -> {
            // TODO: Implement Settings functionality
            // Example: Start a settings activity to configure server URL, etc.
            Intent settingsIntent = new Intent(this, AppSettingsActivity.class);
            startActivity(settingsIntent);
        });
    }
}