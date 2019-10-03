package com.rpm.belajarlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CustomTableLayout extends AppCompatActivity implements View.OnClickListener{

    EditText edtusername, edtpass;
    Button login;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout_modif);

        edtusername = findViewById(R.id.edtUsername);
        edtpass = findViewById(R.id.edtPass);
        login = findViewById(R.id.button);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username = edtusername.getText().toString();
        String pass = edtpass.getText().toString();

        if (username.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin123")) {
            Toast.makeText(CustomTableLayout.this,
                    "Anda Berhasil Login", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(CustomTableLayout.this,
                    "Anda Gagal Login", Toast.LENGTH_LONG).show();
        }
    }
}

