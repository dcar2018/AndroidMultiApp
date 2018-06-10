package com.dcar.mynewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculator;
    private Button btnTicTacToe;
    private Button btnMathPractice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculator = (Button) findViewById(R.id.buttonCalculator);
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalculatorPage();
            }
        });

        btnTicTacToe = (Button) findViewById(R.id.buttonTicTacToe);
        btnTicTacToe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTicTacToePage();
            }
        });

        btnMathPractice = (Button) findViewById(R.id.buttonMathPractice);
        btnMathPractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMathPracticePage();
            }
        });
    }


    public void openCalculatorPage() {
        Intent intentCalculator = new Intent(this, CalculatorActivity.class);
        startActivity(intentCalculator);
    }

    public void openTicTacToePage() {
        Intent intentTicTacToe = new Intent(this, TicTacToeActivity.class);
        startActivity(intentTicTacToe);
    }

    public void openMathPracticePage() {
        Intent intentMathPractice = new Intent(this, MathPracticeActivity.class);
        startActivity(intentMathPractice);
    }


}
