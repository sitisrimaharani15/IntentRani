package com.rani.belajarintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class latihan1 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout1);
        }

        public void login (View view) {
            Intent i = new Intent(getApplicationContext(), latihan1_2.class);

    }

}
