package com.example.firstpage.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.firstpage.fragments.Blog_fragment;
import com.example.firstpage.fragments.Chat_Fragment;
import com.example.firstpage.fragments.HomeFragment;
import com.example.firstpage.fragments.Person_Fragment;
import com.example.firstpage.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {
    public DrawerLayout drawerLayout;
    public NavigationView navigationView;
    BottomNavigationView bottomNavigationView;
    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        drawerLayout = findViewById(R.id.Drawer);
        navigationView = findViewById(R.id.navigaton_view);
        toolbar = findViewById(R.id.app_barr);
        bottomNavigationView = findViewById(R.id.bot_nav);
        bottomNavigationView.setSelectedItemId(R.id.bot_nav);
        loadFrag(new HomeFragment());
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                int id = item.getItemId();
                if (id == R.id.home) {
                    HomeActivity.this.loadFrag(new HomeFragment());
                } else if (id == R.id.message) {
                    HomeActivity.this.loadFrag(new Chat_Fragment());

                } else if (id == R.id.chat) {
                    HomeActivity.this.loadFrag(new Blog_fragment());

                } else if (id == R.id.person) {
                    HomeActivity.this.loadFrag(new Person_Fragment());

                }

                return true;
            }
        });
//        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.logout) {
                    HomeActivity.this.finish();
                } else if (id == R.id.ship_addr) {
                    Toast.makeText(HomeActivity.this, "Shipping Address Called", Toast.LENGTH_SHORT).show();

                } else if (id == R.id.home) {
                    Toast.makeText(HomeActivity.this, "Home Called", Toast.LENGTH_SHORT).show();

                } else if (id == R.id.cur_order_sta) {
                    Toast.makeText(HomeActivity.this, "Current Order Called", Toast.LENGTH_SHORT).show();

                } else if (id == R.id.or_history) {
                    Toast.makeText(HomeActivity.this, "Order History  Called", Toast.LENGTH_SHORT).show();

                } else if (id == R.id.profile) {
                    Toast.makeText(HomeActivity.this, "Profile Called", Toast.LENGTH_SHORT).show();

                } else if (id == R.id.change_card) {
                    Toast.makeText(HomeActivity.this, "Change Card Called", Toast.LENGTH_SHORT).show();

                }

                return true;

            }
        });
    }


    public void loadFrag(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.Frame_layout, fragment);
        fragmentTransaction.commit();


    }
}
