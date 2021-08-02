package com.example.mediaplayerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton play_button,puse_botton;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play_button=findViewById(R.id.playButtonId);
        puse_botton=findViewById(R.id.puse_ButtonId);

        //media player create

        mediaPlayer=MediaPlayer.create(this,R.raw.nabola);


        play_button.setOnClickListener(this);
        puse_botton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        if (v.getId()==R.id.playButtonId){

            if (mediaPlayer!=null){

                mediaPlayer.start();

                Toast.makeText(this, "play_music", Toast.LENGTH_SHORT).show();



            }






        }

        if (v.getId()==R.id.puse_ButtonId){


            if (puse_botton!=null){

                mediaPlayer.pause();
                Toast.makeText(this, "stop_music", Toast.LENGTH_SHORT).show();

            }


        }




    }

    @Override
    protected void onDestroy() {
        if(mediaPlayer!=null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.release();
           mediaPlayer=null;
        }
        super.onDestroy();
    }
}