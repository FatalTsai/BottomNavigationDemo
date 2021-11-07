package com.example.bottomnavigationdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
//    https://www.youtube.com/watch?v=JjfSjMs0ImQ REF this
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);

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

                        return;

                    case  R.id.about:
                        startActivity(new Intent(getApplicationContext(),About.class));
                        overridePendingTransition(0,0);
                        return;
                }
            }
        });

    }
}