package com.andrey.labratory_work_4_pofmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    TextView textView;

    float firstNumber;
    float secondNumber;
    float result;

    public void Addition(View view){
        firstNumber = Float.valueOf(editText1.getText().toString());
        secondNumber = Float.valueOf(editText2.getText().toString());
        result = firstNumber + secondNumber;
        String res = firstNumber + " + " + secondNumber + " = " + result;
        textView.setText(res);
    }
    public void Subtraction(View view){
        firstNumber = Float.valueOf(editText1.getText().toString());
        secondNumber = Float.valueOf(editText2.getText().toString());
        result = firstNumber - secondNumber;
        String res = firstNumber + " - " + secondNumber + " = " + result;
        textView.setText(res);
    }
    public void Multiplication(View view){
        firstNumber = Float.valueOf(editText1.getText().toString());
        secondNumber = Float.valueOf(editText2.getText().toString());
        if (firstNumber == 0.0 || secondNumber == 0.0) return;
        result = firstNumber * secondNumber;
        String res = firstNumber + " * " + secondNumber + " = " + result;
        textView.setText(res);
    }
    public void Highlighting(View view){
        firstNumber = Float.valueOf(editText1.getText().toString());
        secondNumber = Float.valueOf(editText2.getText().toString());
        result = firstNumber / secondNumber;
        String res = firstNumber + " / " + secondNumber + " = " + result;
        textView.setText(res);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.ed1);
        editText2 = (EditText) findViewById(R.id.ed2);
        textView = (TextView) findViewById(R.id.tv1);
    }
}