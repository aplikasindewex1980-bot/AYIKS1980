package com.example.ayiks;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.SharedPreferences;

public class PinActivity extends AppCompatActivity {

    private EditText pinEditText;
    private Button savePinButton;
    private SharedPreferences sharedPreferences;
    private static final String PREF_NAME = "MyPrefs";
    private static final String PIN_KEY = "adminPin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);

        pinEditText = findViewById(R.id.pinEditText);
        savePinButton = findViewById(R.id.savePinButton);
        sharedPreferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE);

        savePinButton.setOnClickListener(v -> {
            String pin = pinEditText.getText().toString();
            if (pin.length() == 4) { // Or any desired length
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(PIN_KEY, pin);
                editor.apply();
                Toast.makeText(this, "PIN saved successfully!", Toast.LENGTH_SHORT).show();
                finish(); // Close the activity after saving
            } else {
                Toast.makeText(this, "PIN must be 4 digits", Toast.LENGTH_SHORT).show();
            }
        });
    }
}