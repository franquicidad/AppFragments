package com.example.mac.appfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.resFragment, new RestauFragment())
//                .commit();

        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        MyPagerAdapter adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);

    }


//        FragmentManager fragmentManager=getSupportFragmentManager();
//
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//
//        RestauFragment restauFragment=new RestauFragment();
//        fragmentTransaction.add(R.id.resFragment, restauFragment );
//        fragmentTransaction.commit();




    }

