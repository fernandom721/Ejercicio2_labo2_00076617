package com.example.ejercicio2_labo2_00076617;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int[] ImageArray = {
    R.drawable.donko01,R.drawable.donko02,R.drawable.donko03,R.drawable.kirby01,R.drawable.kirby02,R.drawable.kirby03,R.drawable.link01,R.drawable.link02,R.drawable.link03};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView img1 = findViewById(R.id.img1);
        final ImageView img2 = findViewById(R.id.img2);
        final ImageView img3 = findViewById(R.id.img3);
        final ImageView img4 = findViewById(R.id.img4);
        final ImageView img5 = findViewById(R.id.img5);
        final ImageView img6 = findViewById(R.id.img6);
        final ImageView img7 = findViewById(R.id.img7);
        final ImageView img8 = findViewById(R.id.img8);
        final ImageView img9 = findViewById(R.id.img9);
        //img1.setImageResource(R.drawable.donko01);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomindex = new Random().nextInt(ImageArray.length);
                int randomImage = ImageArray[randomindex];
                img1.setImageResource(randomImage);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomindex = new Random().nextInt(ImageArray.length);
                int randomImage = ImageArray[randomindex];
                img2.setImageResource(randomImage);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomindex = new Random().nextInt(ImageArray.length);
                int randomImage = ImageArray[randomindex];
                img3.setImageResource(randomImage);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomindex = new Random().nextInt(ImageArray.length);
                int randomImage = ImageArray[randomindex];
                img4.setImageResource(randomImage);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomindex = new Random().nextInt(ImageArray.length);
                int randomImage = ImageArray[randomindex];
                img5.setImageResource(randomImage);
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomindex = new Random().nextInt(ImageArray.length);
                int randomImage = ImageArray[randomindex];
                img6.setImageResource(randomImage);
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomindex = new Random().nextInt(ImageArray.length);
                int randomImage = ImageArray[randomindex];
                img7.setImageResource(randomImage);
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomindex = new Random().nextInt(ImageArray.length);
                int randomImage = ImageArray[randomindex];
                img8.setImageResource(randomImage);
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomindex = new Random().nextInt(ImageArray.length);
                int randomImage = ImageArray[randomindex];
                img9.setImageResource(randomImage);
            }
        });
    }
}
