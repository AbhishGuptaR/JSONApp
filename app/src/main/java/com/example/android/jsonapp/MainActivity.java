package com.example.android.jsonapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ViewPager viewPager;
    MenuItem prevMenuItem;
    HomeFragment homeFragment;
    SearchFragment searchFragment;
    FavouritesFragment favouritesFragment;
    SettingsFragment settingsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Listado");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomnavigationlayout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        homeFragment = new HomeFragment();
        searchFragment = new SearchFragment();
        favouritesFragment = new FavouritesFragment();
        settingsFragment = new SettingsFragment();
        viewPagerAdapter.addFragment(homeFragment);
        viewPagerAdapter.addFragment(searchFragment);
        viewPagerAdapter.addFragment(favouritesFragment);
        viewPagerAdapter.addFragment(settingsFragment);
        viewPager.setAdapter(viewPagerAdapter);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bottomhome:
                        viewPager.setCurrentItem(0);
                        return true;
                    case R.id.bottomsearch:
                        viewPager.setCurrentItem(1);
                        return true;
                    case R.id.bottomfavourite:
                        viewPager.setCurrentItem(2);
                        return true;
                    case R.id.bottomsettings:
                        viewPager.setCurrentItem(3);
                        return true;
                }
                    return true;
                }
               });

                viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(int position) {
                        if(prevMenuItem!=null){
                            prevMenuItem.setCheckable(false);
                        }
                        else{
                            bottomNavigationView.getMenu().getItem(0).setChecked(false);
                        }

                        bottomNavigationView.getMenu().getItem(position).setChecked(true);
                        prevMenuItem = bottomNavigationView.getMenu().getItem(position);

                    }

                    @Override
                    public void onPageScrollStateChanged(int state){

                    }
                });


        }
        }



