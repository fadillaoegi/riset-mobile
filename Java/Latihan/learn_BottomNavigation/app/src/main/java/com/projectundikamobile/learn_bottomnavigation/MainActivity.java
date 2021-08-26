package com.projectundikamobile.learn_bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.projectundikamobile.learn_bottomnavigation.Fragmen.fragmenHome;
import com.projectundikamobile.learn_bottomnavigation.Fragmen.fragmenProfile;
import com.projectundikamobile.learn_bottomnavigation.Fragmen.fragmenSchedule;
import com.projectundikamobile.learn_bottomnavigation.Fragmen.fragmenSearch;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private Fragment fragment = null;
    private BottomNavigationView bottomNavigationView;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private long backPressedTime;
    private String id;
    private int test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        //cara 1 menampilkan First layout
        if (savedInstanceState != null) {
            fragment = getSupportFragmentManager().getFragment(savedInstanceState, "Nav");
            loadFragment(fragment);
        }

        loadFragment(new fragmenHome());

        //        cara 1 menampilkan First layout
        //firstLayoutNav();


    }

    public void firstLayoutNav() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.mainBotNav, new fragmenHome());
        fragmentTransaction.commit();
    }

    public void findViews() {

        // Set Up Bottom Navigation
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);


    }

    public boolean loadFragment(Fragment fragment) {

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.mainBotNav, fragment)
                    .commit();

            return true;
        }

        return false;

    }


    public boolean onNavigationItemSelected(MenuItem item) {


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

            // Jika Pake fnction loadfragmen
            return loadFragment(fragment);

//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.mainBotNav, fragment)
//                .commit();
//            return false;



        }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
        }else {
            Toast.makeText(this, "Tekan 2 kali untuk keluar", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }
}