package com.projectundikamobile.login_with_variable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class variabel_login extends AppCompatActivity {

    private TextView txuser1, txpass1;
    private String password, username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variabel_login);
        inisialisai();
        munculdata();
    }

    public void inisialisai(){

        txuser1 = findViewById(R.id.txtuser);
        txpass1 = findViewById(R.id.txtpassw);

    }

    public void munculdata(){

        Intent intent = getIntent();

        username = intent.getStringExtra("username");
        password = intent.getStringExtra("password");

        txuser1.setText(username);
        txpass1.setText(password);


    }

}