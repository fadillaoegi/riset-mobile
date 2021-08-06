package com.projectundikamobile.login_with_variable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button b;
    private EditText Etusername, Etpassword;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        set();

    }


    public void init() {

        b = findViewById(R.id.login);
        Etusername = findViewById(R.id.user);
        Etpassword = findViewById(R.id.pass);

    }

    public void set(){

        username = Etusername.getText().toString();
        password = Etpassword.getText().toString();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Action

                Intent intent = new Intent(MainActivity.this, variabel_login.class);
                intent.putExtra("username", username);
                intent.putExtra("password", password);
                startActivity(intent);

            }
        });

    }
}