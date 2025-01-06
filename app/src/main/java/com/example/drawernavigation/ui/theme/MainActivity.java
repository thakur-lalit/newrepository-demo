package com.example.drawernavigation.ui.theme;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.newapp.CartFragment;
import com.example.newapp.ContactFragment;
import com.example.newapp.FeedbackFragment;
import com.example.newapp.FavouriteFragment;
import com.example.newapp.HistoryFragment;
import com.example.newapp.MenuFragment;
import com.example.newapp.OngoingOrdersFragment;
import com.example.newapp.R;
import com.example.newapp.ShareFragment;
import com.example.newapp.TermsFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    ImageView ivClickImage;
    Button editButton;
    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);
        navigationView = findViewById(R.id.navigationView);

        // Access the header view
        View headerView = navigationView.getHeaderView(0);

        editButton = headerView.findViewById(R.id.editButton);
        ivClickImage = headerView.findViewById(R.id.ivClickImage);

        // Set an OnClickListener to handle the button click
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EditButtonActivity.class));
            }
        });

        ivClickImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FullImageActivity.class));
            }
        });

        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();
            }
        });


        }
}