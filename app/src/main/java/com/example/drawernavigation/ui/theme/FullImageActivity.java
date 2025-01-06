package com.example.drawernavigation.ui.theme;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.newapp.R;

public class FullImageActivity extends AppCompatActivity {

    ImageView fullImageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

         fullImageView = findViewById(R.id.fullImageView);


        int imageResId = getIntent().getIntExtra("fullImageView", -1);
        if (imageResId != -1) {
            fullImageView.setImageResource(imageResId);
        }

    }
}
