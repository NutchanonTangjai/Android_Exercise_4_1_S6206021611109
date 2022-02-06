//6206021611109 ณัฐชนน ต่างใจ
package com.example.exercise4_1s6206021611109;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText numText;
    private TextView textDec;
    private TextView textBin;
    private TextView textOc;
    private TextView textHex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textDec = (TextView) findViewById(R.id.textDec);
        textBin = (TextView) findViewById(R.id.textBin);
        textOc = (TextView) findViewById(R.id.textOc);
        textHex = (TextView) findViewById(R.id.textHex);
    }
    public void decCal(int num){
        textDec.setText("Decimal : " + num);
    }
    public void binCal(int num){
        String tmp = "",text = "";
        while (num>0){
            tmp += num%2;
            num/=2;
        }
        for (int i=tmp.length()-1; i>=0; i--){
            char chr = tmp.charAt(i);
            text+=chr;
        }
        textBin.setText("Binary : " +text);
    }
    public void ocCal(int num){
        String tmp = "",text = "";
        while (num>0){
            tmp += num%8;
            num/=8;
        }
        for (int i=tmp.length()-1; i>=0; i--){
            char chr = tmp.charAt(i);
            text+=chr;
        }
        textOc.setText("Octal : " +text);
    }
    public void hexCal(int num){
        String tmp = "",text = "";
        while (num>0){
            int numtmp = num%16;
            if(numtmp == 10){
                tmp += "A";
            }
            else if(numtmp == 11){
                tmp += "B";
            }
            else if(numtmp == 12){
                tmp += "C";
            }
            else if(numtmp == 13){
                tmp += "D";
            }
            else if(numtmp == 14){
                tmp += "E";
            }
            else if(numtmp == 15){
                tmp += "F";
            }
            else {
                tmp += num % 16;
            }
            num/=16;
        }
        for (int i=tmp.length()-1; i>=0; i--){
            char chr = tmp.charAt(i);
            text+=chr;
        }
        textHex.setText("Hexa : " +text);
    }
    public void onClick(View v)
    {
        numText = (EditText) findViewById(R.id.numText);
        //Toast.makeText( this, numText.getText(),Toast.LENGTH_LONG).show();
        if((numText.getText().toString()).length() < 1){
            Toast.makeText( this, "Please enter Number !",Toast.LENGTH_LONG).show();
            textDec.setText("Decimal : ");
            textBin.setText("Binary : ");
            textOc.setText("Octal : ");
            textHex.setText("Hexa : ");
        }
        else {
            int num = Integer.parseInt(numText.getText().toString());
            decCal(num);
            binCal(num);
            ocCal(num);
            hexCal(num);
        }
    }
}

