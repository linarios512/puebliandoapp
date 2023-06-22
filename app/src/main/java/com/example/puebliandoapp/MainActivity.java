package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.RemoteViews;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS= Elementos de la actividad

    MediaPlayer cancion;

    //METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cancion =MediaPlayer.create(this,R.raw.audioapp);
        cancion.start();

        //Temporizamos el Splash
        TimerTask inicioAPP=new TimerTask() {
            @Override
            public void run() {
                //Lanzo el HOME
                Intent lanzamiento=new Intent(MainActivity.this,Home.class);
                startActivity(lanzamiento);


            }
        };
        Timer tiempo=new Timer();
        tiempo.schedule(inicioAPP,10000);
    }
}