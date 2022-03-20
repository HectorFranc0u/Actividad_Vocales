package com.example.ugb;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgA = findViewById(R.id.imgbtn_a);
        ImageButton imgE = findViewById(R.id.imgbtn_e);
        ImageButton imgI = findViewById(R.id.imgbtn_i);
        ImageButton imgO = findViewById(R.id.imgbtn_o);
        ImageButton imgU = findViewById(R.id.imgbtn_u);

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.presentacion);
        mp.start();

        imgA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer soundA = MediaPlayer.create(getApplicationContext(), R.raw.a);
                soundA.start();
            }
        });

        imgE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer soundE = MediaPlayer.create(getApplicationContext(), R.raw.e);
                soundE.start();
            }
        });

        imgI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer soundI = MediaPlayer.create(getApplicationContext(), R.raw.i);
                soundI.start();
            }
        });

        imgO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer soundO = MediaPlayer.create(getApplicationContext(), R.raw.o);
                soundO.start();
            }
        });

        imgU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer soundU = MediaPlayer.create(getApplicationContext(), R.raw.u);
                soundU.start();
            }
        });
    }

}