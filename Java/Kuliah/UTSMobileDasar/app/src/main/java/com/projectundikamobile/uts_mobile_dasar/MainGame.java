package com.projectundikamobile.uts_mobile_dasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainGame extends AppCompatActivity {

    ImageView kertas, batu, gunting,musuh, pemain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main_game);

        Intent i =getIntent();

        kertas = (ImageView)findViewById(R.id.kertas);
        batu   = (ImageView)findViewById(R.id.batu);
        gunting= (ImageView)findViewById(R.id.gunting);

        musuh =(ImageView)findViewById(R.id.musuh);
        pemain = (ImageView)findViewById(R.id.pemain);

        kertas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pemain.setImageResource(R.drawable.kertas);
                String notif = play_turn("kertas");
                Toast.makeText(MainGame.this, notif, Toast.LENGTH_SHORT).show();

            }

        });

        gunting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pemain.setImageResource(R.drawable.gunting);
                String notif = play_turn("gunting");
                Toast.makeText(MainGame.this, notif, Toast.LENGTH_SHORT).show();

            }

        });

        batu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pemain.setImageResource(R.drawable.batu);
                String notif = play_turn("batu");
                Toast.makeText(MainGame.this, notif, Toast.LENGTH_SHORT).show();

            }

        });

    }

    public String play_turn(String pilihan) {
        String komputer_1 = "";
        Random r = new Random();

        int komputer_2 = r.nextInt(3) + 1;

        if (komputer_2 == 1){
            komputer_1 = "batu";
        } else if (komputer_2 == 2){
            komputer_1 = "gunting";
        } else if (komputer_2 == 3) {
            komputer_1 = "kertas";
        }

        if (komputer_1 == "batu") {
            musuh.setImageResource(R.drawable.batu);
        } else if(komputer_1 == "gunting") {
            musuh.setImageResource(R.drawable.gunting);
        } else if(komputer_1 == "kertas") {
            musuh.setImageResource(R.drawable.kertas);
        }

        if (pilihan == komputer_1) {
            return "Draw";
        } else if (pilihan == "batu" && komputer_1 == "gunting") {
            return "Batu lawan gunting, Anda menang";
        } else if (pilihan == "batu" && komputer_1 == "kertas") {
            return "Kertas lawan batu, Anda kalah komputer menang!";
        } else if (pilihan == "gunting" && komputer_1 == "batu") {
            return "Gunting lawan batu, Anda kalah komputer menang!";
        } else if (pilihan == "gunting" && komputer_1 == "kertas") {
            return "Gunting lawan gunting, kamu menang";
        } else if (pilihan == "kertas" && komputer_1 == "batu") {
            return "Kertas lawan batu, Anda menang";
        } else if (pilihan == "kertas" && komputer_1 == "gunting") {
            return "Kertas lawan gunting, Anda kalah komputer menang!";
        }

        else return "Kasian Deh Lu :(";

    }
}