package com.dcar.mynewapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MathPracticeActivity extends AppCompatActivity {


    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnCheck, btnClear,btnNext;

    EditText edtAns;
    TextView txtTests;
    int num1, num2, expectedAns, actualAns;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_practice);
        num1 = (int )(Math. random() * 12 + 0);
        num2 = (int )(Math. random() * 12 + 0);


        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnClear = (Button) findViewById(R.id.btnClear);
        edtAns = (EditText) findViewById(R.id.ans);
        txtTests = (TextView) findViewById(R.id.tests);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnCheck = (Button) findViewById(R.id.btnCheck);

        edtAns.setCursorVisible(false);
        edtAns.setEnabled(false);
        edtAns.setTextDirection(View.TEXT_DIRECTION_RTL);
        edtAns.setTextColor(Color.BLACK);

        txtTests.setText(num1+" X "+num2);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = getRandomNum();
                num2 = getRandomNum();
                edtAns.setGravity(Gravity.RIGHT);
                edtAns.setText("");
                txtTests.setText(num1+" X "+num2);
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expectedAns = num1*num2;
                System.out.println("== expectedAns = "+expectedAns);
                actualAns = Integer.valueOf(edtAns.getText()+"");
                System.out.println("== actualAns = "+actualAns);
                if (expectedAns == actualAns)
                {
                    edtAns.setGravity(Gravity.CENTER);
                    edtAns.setText("Correct, Hooray !!! try again");
                }
                else {
                    edtAns.setGravity(Gravity.CENTER);
                    edtAns.setText("Wrong !!! try again, correct ans = "+expectedAns+" but yours "+actualAns);
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAns.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAns.setText(edtAns.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAns.setText(edtAns.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAns.setText(edtAns.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAns.setText(edtAns.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAns.setText(edtAns.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAns.setText(edtAns.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAns.setText(edtAns.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAns.setText(edtAns.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAns.setText(edtAns.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAns.setText(edtAns.getText() + "9");
            }
        });


    }

    public int getRandomNum(){
        return (int )(Math. random() * 12 + 0);
    }
}
