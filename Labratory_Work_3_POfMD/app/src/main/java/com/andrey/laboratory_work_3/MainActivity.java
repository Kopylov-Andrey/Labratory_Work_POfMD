package com.andrey.laboratory_work_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayout;
    private TextView textView1, textView2;
    private Button buttonPurplePink, buttonGrayBlue, buttonOrangeYellow, buttonGreen, buttonPurple, buttonRed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.linerl);
        textView1 = (TextView) findViewById(R.id.tv1);
        textView2 = (TextView) findViewById(R.id.tv2);
        buttonPurplePink = (Button) findViewById(R.id.btpp);
        buttonGrayBlue = (Button) findViewById(R.id.btgb);
        buttonOrangeYellow = (Button) findViewById(R.id.btyo);
        buttonGreen = (Button) findViewById(R.id.btG);
        buttonPurple = (Button) findViewById(R.id.btp);
        buttonRed = (Button) findViewById(R.id.btr);
    }

    public void toPurplePink(View view){

        textView1.setBackgroundColor(getResources().getColor(R.color.pink));
        textView1.setTextColor(getResources().getColor(R.color.myPurple1));
        textView2.setBackgroundColor(getResources().getColor(R.color.pink));
        textView2.setTextColor(getResources().getColor(R.color.myPurple1));
    }
    public void toGrayBlue(View view){
        textView1.setBackgroundColor(getResources().getColor(R.color.DarkBlue));
        textView1.setTextColor(getResources().getColor(R.color.Gray));
        textView2.setBackgroundColor(getResources().getColor(R.color.DarkBlue));
        textView2.setTextColor(getResources().getColor(R.color.Gray));
    }
    public void toOrangeYellow(View view){
        textView1.setBackgroundColor(getResources().getColor(R.color.Yellow));
        textView1.setTextColor(getResources().getColor(R.color.Orange));
        textView2.setBackgroundColor(getResources().getColor(R.color.Yellow));
        textView2.setTextColor(getResources().getColor(R.color.Orange));
    }
    public void toPurple(View view){
        linearLayout.setBackgroundColor(getResources().getColor(R.color.myPurple2));
    }
    public void toGreen(View view){
        linearLayout.setBackgroundColor(getResources().getColor(R.color.Green));
    }
    public void toRed(View view){
        linearLayout.setBackgroundColor(getResources().getColor(R.color.Red));
    }
}