package ru.myitschool.mycheckers1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MyCheckers extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyCheckersDraw(this));
    }
}