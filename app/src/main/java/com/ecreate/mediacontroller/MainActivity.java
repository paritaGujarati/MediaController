package com.ecreate.mediacontroller;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ecreate.library.MediaControl;
import com.ecreate.library.VideoPlayer;


public class MainActivity extends AppCompatActivity {

  VideoPlayer videoView;
  MediaControl mediaController;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    videoView =  findViewById(R.id.videoView);
    mediaController = new MediaControl(MainActivity.this);
    videoView.setMediaController(mediaController);
    videoView.setVideoURI(Uri.parse("https://media.istockphoto.com/videos/girl-fills-tartlets-with-custard-pastry-sweet-tartlets-dessert-video-id1159983942"));
    videoView.start();
  }
}
