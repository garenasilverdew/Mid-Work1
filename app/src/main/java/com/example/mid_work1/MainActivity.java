package com.example.mid_work1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button button;
    String A = "Login";
    String B = "login out";
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

    }

    public void Login(View view) {
        if(i==0) {
            button.setText(B);
            i=1;
        }
        else{
            button.setText(A);
            i=0;
        }

    }
}