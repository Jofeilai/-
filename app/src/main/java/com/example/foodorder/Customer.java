package com.example.foodorder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Customer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer2);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        return;

                    case R.id.map:
                        startActivity(new Intent(getApplicationContext(), Customer_Map.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;

                    case R.id.search:
                        startActivity(new Intent(getApplicationContext(), Customer_Search.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;

                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), Customer_Profile.class));
                        finish();
                        overridePendingTransition(0,0);
                        return;
                }
            }
        });

    }
}