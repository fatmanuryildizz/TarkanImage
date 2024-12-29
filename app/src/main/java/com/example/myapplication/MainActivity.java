package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int[] imageResources = {R.drawable.img, R.drawable.img2}; // Array of images
    private int currentImageIndex = 0; // Index to track the current image

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImage(View view) {
        ImageView imageView = findViewById(R.id.imageView);

        // Update to the next image in the array
        currentImageIndex = (currentImageIndex + 1) % imageResources.length;

        // Set the new image
        imageView.setImageResource(imageResources[currentImageIndex]);
    }
}


