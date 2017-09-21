package com.example.ashraf.landcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class QuardViewShow extends AppCompatActivity {
    private TextView squareText;
    private double squareDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quard_view_show);

        squareText= (TextView) findViewById(R.id.SqueView);

        squareDouble=getIntent().getDoubleExtra("Square",0);
        squareText.setText(Double.toString(squareDouble));


    }
}
