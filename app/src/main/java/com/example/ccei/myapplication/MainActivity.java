package com.example.ccei.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button one, two, three, four, five, six, seven, eight, nine, zero, dot, equal, del, div, multi, minus, plus;
    TextView show;
    String input = "", operand1 = "", operand2 = "", operator = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = (TextView)findViewById(R.id.show);
        one = (Button)findViewById(R.id.one); two = (Button)findViewById(R.id.two); three = (Button)findViewById(R.id.three); four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five); six = (Button)findViewById(R.id.six); seven = (Button)findViewById(R.id.seven); eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine); zero = (Button)findViewById(R.id.zero); dot = (Button)findViewById(R.id.dot); equal = (Button)findViewById(R.id.equal);
        del = (Button)findViewById(R.id.del); div = (Button)findViewById(R.id.div); multi = (Button)findViewById(R.id.multi); minus = (Button)findViewById(R.id.minus);
        plus = (Button)findViewById(R.id.plus);

        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                input += "1";
                show.setText(input);
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                input += "2";
                show.setText(input);
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                input += "3";
                show.setText(input);
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                input += "4";
                show.setText(input);
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                input += "5";
                show.setText(input);
            }
        });
        six.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                input += "6";
                show.setText(input);
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                input += "7";
                show.setText(input);
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                input += "8";
                show.setText(input);
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                input += "9";
                show.setText(input);
            }
        });
        zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                input += "0";
                show.setText(input);
            }
        });
        dot.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!input.contains(".")) {
                    input += ".";
                    show.setText(input);
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                operand2 = input;
                if(operand1 != "") {
                    if (operand1.contains(".") || operand2.contains(".") || operator == "÷") {
                        switch (operator) {
                            case "＋":
                                input = Double.toString(Double.parseDouble(operand1) + Double.parseDouble(operand2));
                                show.setText(input);
                                break;
                            case "－":
                                input = Double.toString(Double.parseDouble(operand1) - Double.parseDouble(operand2));
                                show.setText(input);
                                break;
                            case "×":
                                input = Double.toString(Double.parseDouble(operand1) * Double.parseDouble(operand2));
                                show.setText(input);
                                break;
                            case "÷":
                                input = Double.toString(Double.parseDouble(operand1) / Double.parseDouble(operand2));
                                show.setText(input);
                                break;
                        }
                    } else {
                        switch (operator) {
                            case "＋":
                                input = Integer.toString(Integer.parseInt(operand1) + Integer.parseInt(operand2));
                                show.setText(input);
                                break;
                            case "－":
                                input = Integer.toString(Integer.parseInt(operand1) - Integer.parseInt(operand2));
                                show.setText(input);
                                break;
                            case "×":
                                input = Integer.toString(Integer.parseInt(operand1) * Integer.parseInt(operand2));
                                show.setText(input);
                                break;
                        }
                    }
                }
            }
        });
        del.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(input.length() != 0) {
                    input = input.substring(0, input.length() - 1);
                    show.setText(input);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                operator = "÷";
                operand1 = input;
                input = "";
            }
        });
        multi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                operator = "×";
                operand1 = input;
                input = "";
            }
        });
        minus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                operator = "－";
                operand1 = input;
                input = "";
            }
        });
        plus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                operator = "＋";
                operand1 = input;
                input = "";
            }
        });
    }
}
