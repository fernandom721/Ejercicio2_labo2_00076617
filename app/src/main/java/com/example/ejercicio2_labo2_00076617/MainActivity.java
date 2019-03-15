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
    R.drawable.donko01,R.drawable.donko02,R.drawable.kirbi01,R.drawable.kirbi02,R.drawable.link01,R.drawable.link02};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView img1 = findViewById(R.id.img1);
        //img1.setImageResource(R.drawable.donko01);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomindex = new Random().nextInt(ImageArray.length);
                int randomImage = ImageArray[randomindex];
                img1.setImageResource(randomImage);
            }
        });
    }
}
