package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;
    public static String TAG = MainActivity.class.getSimpleName();
    private RadioGroup cartoon;
    private RadioButton cartoonButton;
    private Button btnDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.username);
        cartoon=(RadioGroup)findViewById(R.id.choice);

        btnDisplay=(Button)findViewById(R.id.button3);

    }

    public void LoginClick(View viewClicked) {
        String personName = nameEditText.getText().toString();
        Toast.makeText(this, personName, Toast.LENGTH_SHORT).show();
        int selectedId=cartoon.getCheckedRadioButtonId();
        cartoonButton=(RadioButton)findViewById(selectedId);
        Toast.makeText(MainActivity.this,cartoonButton.getText(),Toast.LENGTH_SHORT).show();
        Intent hIntent = new Intent(MainActivity.this, Homeactivity.class);
        hIntent.putExtra("harmankey", personName);
        hIntent.putExtra("cartoonkey", selectedId);

        startActivity(hIntent);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.btn_yes:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.btn_no:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
}