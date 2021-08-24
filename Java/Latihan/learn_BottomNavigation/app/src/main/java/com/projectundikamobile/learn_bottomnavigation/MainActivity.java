package com.projectundikamobile.learn_bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.projectundikamobile.learn_bottomnavigation.Fragmen.fragmenHome;
import com.projectundikamobile.learn_bottomnavigation.Fragmen.fragmenProfile;
import com.projectundikamobile.learn_bottomnavigation.Fragmen.fragmenSchedule;
import com.projectundikamobile.learn_bottomnavigation.Fragmen.fragmenSearch;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.mhome:
                    fragment = new fragmenHome();
                    break;
                case R.id.mprofile:
                    fragment = new fragmenProfile();
                    break;
                case R.id.msearch:
                    fragment = new fragmenSearch();
                    break;
                case R.id.mjadwal:
                    fragment = new fragmenSchedule();
                    break;
            }
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.mainBotNav, fragment).commit();

            return true;

        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();


    }

    public void initViews() {

    }

    public void findViews() {

        // Set Up Bottom Navigation
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);


    }

    public void listenerViews() {

    }
}