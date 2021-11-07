package com.example.bottomnavigationdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.about);

        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener(){

            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                Log.i("Tag", "click item"+item );
                switch (item.getItemId()){
                    case  R.id.dashborad:
                        startActivity(new Intent(getApplicationContext(),Dashborad.class));
                        overridePendingTransition(0,0);
                        return;

                    case  R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return;

                    case  R.id.about:

                        return;
                }
            }
        });
    }
}