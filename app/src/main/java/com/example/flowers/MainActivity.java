package com.example.flowers;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView img1, img2, img3, img4, img5, img6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        getWindow().setStatusBarColor(Color.parseColor("#366E0E"));
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);

        //Glide adding
        Glide.with(this)
                .load("https://static.vecteezy.com/system/resources/thumbnails/040/535/939/small_2x/ai-generated-beautiful-red-rose-flower-plant-summer-generate-ai-photo.jpg")
                .error(R.drawable.no_image)
                .into(img1);

        Glide.with(this)
                .load("https://wallpapercave.com/wp/wp354799.jpg")
                .error(R.drawable.no_image)
                .into(img2);

        Glide.with(this)
                .load("https://i.pinimg.com/originals/72/26/70/72267044e37ff506f773c96a2f6a6ce3.jpg")
                .error(R.drawable.no_image)
                .into(img3);

        Glide.with(this)
                .load("https://i.pinimg.com/736x/55/7b/fa/557bfac6a744b2be86fa076b7df4f6ad.jpg")
                .error(R.drawable.no_image)
                .into(img4);

        Glide.with(this)
                .load("https://c.pxhere.com/photos/2e/3e/bloom_bunch_of_flowers_colorful_colourful_daisies_flowers-1093996.jpg%21d")
                .error(R.drawable.no_image)
                .into(img5);

        Glide.with(this)
                .load("https://i.pinimg.com/originals/1b/4e/91/1b4e918b26da9610ce7e5e57261a37d4.jpg")
                .error(R.drawable.no_image)
                .into(img6);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}