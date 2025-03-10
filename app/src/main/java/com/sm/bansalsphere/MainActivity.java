package com.sm.bansalsphere;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private NavController navController;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navController = Navigation.findNavController(this, R.id.frame_layout);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigation_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.start, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Enable the "up" button for the ActionBar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Pass the event to ActionBarDrawerToggle to handle the "up" button
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.navigation_developer) {
            // Code to handle the "Developer" menu item
            Toast.makeText(this, "Developer", Toast.LENGTH_SHORT).show();
        }
        else if (itemId == R.id.navigation_video) {
            // Code to handle the "Video" menu item
            Toast.makeText(this, "Video", Toast.LENGTH_SHORT).show();
        }
        else if (itemId == R.id.navigation_rate) {
            // Code to handle the "Rate Us" menu item
            Toast.makeText(this, "Rate Us", Toast.LENGTH_SHORT).show();
        }
        else if (itemId == R.id.navigation_share) {
            // Code to handle the "Share" menu item
            Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
        }
        else if (itemId == R.id.navigation_ebook) {
            // Code to handle the "Ebooks" menu item
            Toast.makeText(this, "Ebooks", Toast.LENGTH_SHORT).show();
        }
        else if (itemId == R.id.navigation_theme) {
            // Code to handle the "Theme" menu item
            Toast.makeText(this, "Theme", Toast.LENGTH_SHORT).show();
        }
        else if (itemId == R.id.navigation_website) {
            // Code to handle the "Website" menu item
            Toast.makeText(this, "Website", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
