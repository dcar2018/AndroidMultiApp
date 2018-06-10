package com.dcar.mynewapp;

import android.graphics.Color;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {


    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnDivision, btnMultiplication, btnAdd, btnSub, btnDot, btnEqual,
            btnClear;

    EditText edtCalculator;
    TextView txtInputs;

    float val1, val2, result;
    boolean add, sub, mul, div, equ;
    String inputs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

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
        btnDot = (Button) findViewById(R.id.btnDot);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnClear = (Button) findViewById(R.id.btnClear);
        edtCalculator = (EditText) findViewById(R.id.edt1);
        txtInputs = (TextView) findViewById(R.id.inputs);


        edtCalculator.setCursorVisible(false);
        edtCalculator.setEnabled(false);
        edtCalculator.setTextDirection(View.TEXT_DIRECTION_RTL);
        edtCalculator.setTextColor(Color.BLACK);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculator.setText(edtCalculator.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculator.setText(edtCalculator.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculator.setText(edtCalculator.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculator.setText(edtCalculator.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculator.setText(edtCalculator.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculator.setText(edtCalculator.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculator.setText(edtCalculator.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculator.setText(edtCalculator.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculator.setText(edtCalculator.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculator.setText(edtCalculator.getText() + "9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculator.setText(edtCalculator.getText() + ".");
            }
        });


        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fDiv();
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fMul();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fSub();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fAdd();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCalculator.setText("");
                fClear();
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fEqual();
            }
        });

    }

    public void fClear() {
        val1 = 0;
        val2 = 0;
        add = false;
        mul = false;
        div = false;
        sub = false;
        inputs = "";
        txtInputs.setText(inputs);
    }

    public void fAdd() {
        try {
            if (edtCalculator == null || edtCalculator.getText() == null) {
                edtCalculator.setText("");
            } else {
                val1 = Float.parseFloat(edtCalculator.getText() + "");
                add = true;
                inputs = txtInputs.getText().toString() + edtCalculator.getText() + "+";
                txtInputs.setText(inputs);
                edtCalculator.setText(null);
            }
        }
        catch (Exception e){
                edtCalculator.setText("");

        }
    }

    public void fSub() {
        try {
            if (edtCalculator == null) {
                edtCalculator.setText("");
            } else {
                val1 = Float.parseFloat(edtCalculator.getText() + "");
                sub = true;
                inputs = txtInputs.getText().toString() + edtCalculator.getText() + "-";
                txtInputs.setText(inputs);
                edtCalculator.setText(null);
            }
        }
        catch (Exception e){
            edtCalculator.setText("");

        }
    }

    public void fMul() {
        try {
            if (edtCalculator == null) {
                edtCalculator.setText("");
            } else {
                val1 = Float.parseFloat(edtCalculator.getText() + "");
                mul = true;
                inputs = txtInputs.getText().toString() + edtCalculator.getText() + "*";
                txtInputs.setText(inputs);
                edtCalculator.setText(null);
            }
        }
        catch (Exception e){
            edtCalculator.setText("");

        }
    }

    public void fDiv() {
        try {
            if (edtCalculator == null) {
                edtCalculator.setText("");
            } else {
                val1 = Float.parseFloat(edtCalculator.getText() + "");
                div = true;
                inputs = txtInputs.getText().toString() + edtCalculator.getText() + "/";
                txtInputs.setText(inputs);
                edtCalculator.setText(null);
            }
        }
        catch (Exception e){
            edtCalculator.setText("");

        }
    }

    public void fEqual() {
        inputs = txtInputs.getText().toString() + edtCalculator.getText() + "=";
        String tmpValue = inputs;
        if (edtCalculator == null) {
            edtCalculator.setText("");
        } else {
            val2 = Float.parseFloat(edtCalculator.getText() + "");

            if (add) {
                result = val1 + val2;
            }
            if (sub) {
                result = val1 - val2;
            }
            if (mul) {
                result = val1 * val2;
            }
            if (div) {
                result = val1 / val2;
            }
            fClear();
            txtInputs.setText(tmpValue);
            if (result == (long) result)
                edtCalculator.setText((int) result + "");
            else edtCalculator.setText(result + "");

        }
    }
}
