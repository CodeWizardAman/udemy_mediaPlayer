package com.example.android.mediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private Button controlButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.aashiq);

        controlButton = (Button) findViewById(R.id.play_btn_id);

        controlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) {
                    if (mediaPlayer.isPlaying()) {
                        pause();
                    }
                    else{
                            play();
                    }
                }
            }
        });
    }

    private void pause() {
        mediaPlayer.pause();
        controlButton.setText("Play");
    }

    private void play(){
        mediaPlayer.start();
        controlButton.setText("Pause");
    }
}
