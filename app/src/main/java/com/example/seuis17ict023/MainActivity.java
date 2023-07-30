package com.example.seuis17ict023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;
    private Button addition;
    private Button multiplication;
    private Button division;
    private Button Subtraction;
    private TextView value;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=(EditText)findViewById(R.id.num1);
        number2=(EditText)findViewById(R.id.num2);
        addition=(Button)findViewById(R.id.add);
        multiplication=(Button)findViewById(R.id.multi);
        Subtraction=(Button)findViewById(R.id.sub);
        division=(Button)findViewById(R.id.divi);
        value=(TextView)findViewById(R.id.Result);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1=Integer.parseInt(number1.getText().toString());
                int val2=Integer.parseInt(number2.getText().toString());
                int sum=val1+val2;
                value.setText("Answer:"+String.valueOf(sum));

            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1=Integer.parseInt(number1.getText().toString());
                int val2=Integer.parseInt(number2.getText().toString());
                int mul=val1*val2;
                value.setText("Answer:"+String.valueOf(mul));

            }
        });

        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1=Integer.parseInt(number1.getText().toString());
                int val2=Integer.parseInt(number2.getText().toString());
                int sub=val1-val2;
                value.setText("Answer:"+String.valueOf(sub));

            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1=Integer.parseInt(number1.getText().toString());
                int val2=Integer.parseInt(number2.getText().toString());
                int divi=val1/val2;
                value.setText("Answer:"+String.valueOf(divi));

            }
        });

    }
}