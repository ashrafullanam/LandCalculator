package com.example.ashraf.landcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button triagle,quard,extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        triagle = (Button) findViewById(R.id.triagle);
        quard = (Button) findViewById(R.id.quard);
        extra = (Button) findViewById(R.id.extra);


        quard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,QuardView.class);
                startActivity(intent);
            }
        });


        triagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,TriangleView.class);
                startActivity(intent2);
            }
        });

    }


}
