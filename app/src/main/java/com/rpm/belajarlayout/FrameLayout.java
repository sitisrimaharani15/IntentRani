package com.rpm.belajarlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FrameLayout extends AppCompatActivity {
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
    }

    public void onClick (View v) {
        View vUsername = findViewById(R.id.username);
        vUsername.setVisibility(View.GONE);

        View vPassword = findViewById(R.id.password);
        vPassword.setVisibility(View.VISIBLE);
    }
}


