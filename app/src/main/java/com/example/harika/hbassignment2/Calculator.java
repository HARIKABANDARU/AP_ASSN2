package com.example.harika.hbassignment2;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

public class Calculator extends AppCompatActivity {
    private TextView screen;
    private String display="";
    private String currentOperator="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        screen = (TextView) findViewById(R.id.textView);
        screen.setText(display);
    }
    private void updateScreen() // Rendering output to screen
    {
        screen.setText(display);
    }
//To take input number  from screen

    public void onClickNumber(View v)
    {
        Button b = (Button) v;
        display+=b.getText();
        updateScreen();
    }
 // Take input operator from screen
    public void onClickOperator(View v)
    {
        Button b = (Button)v;
        display+=b.getText();
        currentOperator=b.getText().toString();
        updateScreen();
    }
   private double operatorArithmetic(String a,String b,String op)
   {
       switch(op){
           case "+": return (Double.valueOf(a) + Double.valueOf(b));
           case "-": return (Double.valueOf(a) + Double.valueOf(b));
           case "*": return (Double.valueOf(a) + Double.valueOf(b));
           case "/":try{
               return (Double.valueOf(a) + Double.valueOf(b));
           }catch (Exception e)
           {
               Log.d("Calc",e.getMessage());
           }
           default: return -1;


       }
   }
   public void onClickEqual(View v)
   {
       String[] operation = display.split(Pattern.quote(currentOperator));
       Double result;
       if(operation.length == 1)
           screen.setText(operation[0]);
       else if(operation.length>2)
       {
           result = operatorArithmetic(operation[0],operation[1],currentOperator);
           screen.setText((display+"\n"+String.valueOf(result)));
       }
   }
   private void clear(){
       currentOperator="";
   }
   public void onClickClear(View v)
   {
       clear();
       updateScreen();
   }
}
