package com.android.triangularsquarechecker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.android.triangularsquarechecker.R;
import com.android.triangularsquarechecker.logic.SquareNumber;
import com.android.triangularsquarechecker.logic.TriangularNumber;

public class MainActivity extends AppCompatActivity {

    private EditText num;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText)findViewById(R.id.number);
        res = (TextView)findViewById(R.id.result);
        num.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String number=num.getText().toString();
                String finalResult;
                if(!number.equals("")&&!number.equals("-")&&!number.equals("0")) {
                    int numberI=Integer.parseInt(number);
                    TriangularNumber t = new TriangularNumber(numberI);
                    SquareNumber s= new SquareNumber(numberI);
                    boolean triangular=t.checker();
                    boolean square=s.checker();
                    if(triangular&&square){
                        finalResult="The number is, both triangular and a square number!";
                    }
                    else if(triangular&&!square){
                        finalResult="The number is a triangular number!";
                    }
                    else if(!triangular&&square){
                        finalResult="The number is a square number!";
                    }
                    else {
                        finalResult = "The number is neither triangular nor square!";
                    }
                }
                else{
                    finalResult="";
                }
                res.setText(finalResult);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}