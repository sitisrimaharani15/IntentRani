package com.rani.belajarintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callSecondActivity (View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        i.putExtra("Value1", "Belajar Android");
        i.putExtra("Value2", "Pemrograman Mobile");
        startActivity(i);
    }
}
