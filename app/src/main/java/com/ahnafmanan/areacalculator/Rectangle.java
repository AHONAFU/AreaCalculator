package com.ahnafmanan.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangle extends AppCompatActivity {

    EditText height, width;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        height = findViewById(R.id.height);
        width = findViewById(R.id.width);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = height.getText().toString();
                String s2= width.getText().toString();

                Double h = Double.parseDouble(s1);
                Double w = Double.parseDouble(s2);

                double area = h * w;

                textView.setText("The are aof your circle is: " + area);
            }
        });
    }
}