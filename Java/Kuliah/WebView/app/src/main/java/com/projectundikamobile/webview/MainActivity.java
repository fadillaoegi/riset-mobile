package com.projectundikamobile.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WebView wv ;

    private Button b, b2;

    private TextView t;

    private EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setButton();


    }

    public  void init() {
        wv = (WebView) findViewById(R.id.webview);
        e = (EditText) findViewById(R.id.ev);
        b = (Button) findViewById(R.id.but);
        b2 = (Button) findViewById(R.id.git);
    }

    public void setButton(){

        String search = "https://www.google.com/#search?q=" + e.getText().toString();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Jika tidak pakai mesin pencari
                wv.loadUrl(e.getText().toString());

//                pakaimesin pencari
//                wv.loadUrl(search);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.loadUrl("https://github.com/fadillaoegi");
            }
        });
    }

}