package com.dev.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void btnClick(View view){
        EditText dollarAmount= (EditText) findViewById(R.id.dollerAmount);
        String dollars= dollarAmount.getText().toString();
        double doubleDollar= Double.parseDouble(dollars);
        double inr= 79.99 * doubleDollar;

        String show= "= "+ String.format("%.2f",inr) + " Rs";

        Toast.makeText(this, show, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}