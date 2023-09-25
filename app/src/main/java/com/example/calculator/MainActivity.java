package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText first, second;
    Button a, m, d, s;
    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        a = findViewById(R.id.add);
        m = findViewById(R.id.mul);
        d = findViewById(R.id.divide);
        s = findViewById(R.id.sub);
        out = findViewById(R.id.res);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int f, s, r;
               f = Integer.parseInt(first.getText().toString());
               s = Integer.parseInt(second.getText().toString());
               r = f+s;
               out.setText("Sum is equals to "+ r);


            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, r;
                f = Integer.parseInt(first.getText().toString());
                s = Integer.parseInt(second.getText().toString());
                r = f*s;
                out.setText("Sum is "+ r);


            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, r;
                f = Integer.parseInt(first.getText().toString());
                s = Integer.parseInt(second.getText().toString());
                r = f/s;
                out.setText("Sum is "+ r);
                System.out.println("Experimental Commit 1");


            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, r;
                f = Integer.parseInt(first.getText().toString());
                s = Integer.parseInt(second.getText().toString());
                r = f-s;
                out.setText("Sum is "+ r);


            }
        });

    }
}