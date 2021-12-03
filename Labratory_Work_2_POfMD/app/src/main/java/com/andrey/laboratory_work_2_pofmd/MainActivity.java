package com.andrey.laboratory_work_2_pofmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    Button buttonAdd, buttonCopy;

    public void onAdd(View view){
        String stringOnTextView1 = textView1.getText().toString();
        textView1.setText(stringOnTextView1 + "*");

    }

    public void onCopy(View view){
        String stringOnTextView1 = textView1.getText().toString();

        textView2.setText(stringOnTextView1);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView)findViewById(R.id.TextView1);
        textView2 = (TextView)findViewById(R.id.TextView2);
        buttonAdd = (Button)findViewById(R.id.ButtonAdd);
        buttonCopy = (Button)findViewById(R.id.ButtonCopy);
    }
}