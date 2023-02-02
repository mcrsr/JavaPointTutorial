package com.example.javapointtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = findViewById(R.id.button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = ((TextView)findViewById(R.id.editText1)).getText().toString();
                String value2 = ((TextView)findViewById(R.id.editText2)).getText().toString();
                int result = Integer.parseInt(value1) + Integer.parseInt(value2);
                Toast.makeText(getApplicationContext(), String.valueOf(result), Toast.LENGTH_SHORT).show();
            }
        });

    }

}