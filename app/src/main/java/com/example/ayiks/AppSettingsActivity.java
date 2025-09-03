package com.example.ayiks;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.content.SharedPreferences;
import android.widget.Toast;

public class AppSettingsActivity extends AppCompatActivity {

    private EditText serverUrlEditText;
    private Button saveButton;
    private SharedPreferences sharedPreferences;
    private static final String PREF_NAME = "AppSettings";
    private static final String SERVER_URL_KEY = "serverUrl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_settings);

        serverUrlEditText = findViewById(R.id.serverUrlEditText);
        saveButton = findViewById(R.id.saveButton);
        sharedPreferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE);

        // Load saved server URL, if any
        String savedServerUrl = sharedPreferences.getString(SERVER_URL_KEY, "");
        serverUrlEditText.setText(savedServerUrl);

        saveButton.setOnClickListener(v -> {
            String newServerUrl = serverUrlEditText.getText().toString();

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(SERVER_URL_KEY, newServerUrl);
            editor.apply();

            Toast.makeText(this, "Server URL saved!", Toast.LENGTH_SHORT).show();
            finish(); // Close settings and go back
        });
    }
}