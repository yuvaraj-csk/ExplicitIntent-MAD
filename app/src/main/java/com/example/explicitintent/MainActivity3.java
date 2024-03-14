package com.example.explicit_indent;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.explicit_indent.R;

public class MainActivity3 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView factorialTextView = findViewById(R.id.factorialTextView);

        Intent intent = getIntent();
        int number = intent.getIntExtra("number", 0);

        long factorial = calculateFactorial(number);
        factorialTextView.setText("Factorial of " + number + " is " + factorial);
    }

    private long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
