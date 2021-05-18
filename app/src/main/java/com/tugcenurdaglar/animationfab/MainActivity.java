package com.tugcenurdaglar.animationfab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fabMain, fabMusic, fabCamera;
    private Animation fabacik, fabacik2, fabkapali,fabkapali2,geridonme, ileridonme;

    private Boolean fabDurum = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabMain = findViewById(R.id.fabMain);
        fabMusic = findViewById(R.id.fabMusic);
        fabCamera = findViewById(R.id.fabCamera);

        fabacik  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fabacik);
        fabacik2  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fabacik2);
        fabkapali  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fabkapali);
        fabkapali2  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fabkapali2);
        geridonme  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.geridonme);
        ileridonme  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.ileridonme);

        fabMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fabDurum){
                    //tıklanıldığında kapansın
                    fabMain.startAnimation(geridonme);
                    fabMusic.startAnimation(fabkapali);
                    fabCamera.startAnimation(fabkapali2);
                    fabMusic.setClickable(false);
                    fabCamera.setClickable(false);
                    fabDurum = false;


                }else {
                    //tıklanıldığında açılsın
                    fabMain.startAnimation(ileridonme);
                    fabMusic.startAnimation(fabacik);
                    fabCamera.startAnimation(fabacik2);
                    fabMusic.setClickable(true);
                    fabCamera.setClickable(true);
                    fabDurum = true;

                }
            }
        });
    }
}