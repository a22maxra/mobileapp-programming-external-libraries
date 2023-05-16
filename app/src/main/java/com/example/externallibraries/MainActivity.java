package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        String imageUrl = "https://cdn.pixabay.com/photo/2023/05/11/05/40/blackbird-7985552_960_720.jpg";

        Glide.with(this)
                .load(imageUrl)
                .apply(new RequestOptions().centerCrop())
                .into(imageView);
    }
}
