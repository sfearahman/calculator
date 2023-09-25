package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction1(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        int firstNum = Integer.parseInt(String.valueOf(myTextField1.getText()));
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int secondNum = Integer.parseInt(String.valueOf(myTextField2.getText()));
        int total = firstNum + secondNum;
        goToActivity(String.valueOf(total));
    }

    public void clickFunction2(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        int firstNum = Integer.parseInt(String.valueOf(myTextField1.getText()));
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int secondNum = Integer.parseInt(String.valueOf(myTextField2.getText()));
        int total = firstNum - secondNum;
        goToActivity(String.valueOf(total));
    }

    public void clickFunction3(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        int firstNum = Integer.parseInt(String.valueOf(myTextField1.getText()));
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int secondNum = Integer.parseInt(String.valueOf(myTextField2.getText()));
        int total = firstNum * secondNum;
        goToActivity(String.valueOf(total));
    }

    public void clickFunction4(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        int firstNum = Integer.parseInt(String.valueOf(myTextField1.getText()));
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int secondNum = Integer.parseInt(String.valueOf(myTextField2.getText()));
        if(secondNum != 0){
            double total = firstNum / secondNum;
            goToActivity(String.valueOf(total));
        } else {
            Toast.makeText(getBaseContext(), "Cannot divide by zero", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToActivity(String s){
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}