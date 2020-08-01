package com.ecreate.library;

import android.content.Context;
import android.graphics.Canvas;
import android.media.AudioAttributes;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.widget.MediaController;

import androidx.annotation.NonNull;

import java.io.InputStream;
import java.util.Map;

public class VideoPlayer  extends SurfaceView implements MediaControl.MediaPlayerControl {
    public VideoPlayer(Context context) {
        super((Context)null);
        throw new RuntimeException("Stub!");
    }

    public VideoPlayer(Context context, AttributeSet attrs) {
        super((Context)null);
        throw new RuntimeException("Stub!");
    }

    public VideoPlayer(Context context, AttributeSet attrs, int defStyleAttr) {
        super((Context)null);
        throw new RuntimeException("Stub!");
    }

    public VideoPlayer(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super((Context)null);
        throw new RuntimeException("Stub!");
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }

    public int resolveAdjustedSize(int desiredSize, int measureSpec) {
        throw new RuntimeException("Stub!");
    }

    public void setVideoPath(String path) {
        throw new RuntimeException("Stub!");
    }

    public void setVideoURI(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public void setVideoURI(Uri uri, Map<String, String> headers) {
        throw new RuntimeException("Stub!");
    }

    public void setAudioFocusRequest(int focusGain) {
        throw new RuntimeException("Stub!");
    }

    public void setAudioAttributes(@NonNull AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }

    public void addSubtitleSource(InputStream is, MediaFormat format) {
        throw new RuntimeException("Stub!");
    }

    public void stopPlayback() {
        throw new RuntimeException("Stub!");
    }

    public void setMediaController(MediaControl controller) {
        throw new RuntimeException("Stub!");
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener l) {
        throw new RuntimeException("Stub!");
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener l) {
        throw new RuntimeException("Stub!");
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener l) {
        throw new RuntimeException("Stub!");
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener l) {
        throw new RuntimeException("Stub!");
    }

    public boolean onTouchEvent(MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }

    public boolean onTrackballEvent(MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        throw new RuntimeException("Stub!");
    }

    public void start() {
        throw new RuntimeException("Stub!");
    }

    public void pause() {
        throw new RuntimeException("Stub!");
    }

    public void suspend() {
        throw new RuntimeException("Stub!");
    }

    public void resume() {
        throw new RuntimeException("Stub!");
    }

    public int getDuration() {
        throw new RuntimeException("Stub!");
    }

    public int getCurrentPosition() {
        throw new RuntimeException("Stub!");
    }

    public void seekTo(int msec) {
        throw new RuntimeException("Stub!");
    }

    public boolean isPlaying() {
        throw new RuntimeException("Stub!");
    }

    public int getBufferPercentage() {
        throw new RuntimeException("Stub!");
    }

    public boolean canPause() {
        throw new RuntimeException("Stub!");
    }

    public boolean canSeekBackward() {
        throw new RuntimeException("Stub!");
    }

    public boolean canSeekForward() {
        throw new RuntimeException("Stub!");
    }

    public int getAudioSessionId() {
        throw new RuntimeException("Stub!");
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw new RuntimeException("Stub!");
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw new RuntimeException("Stub!");
    }

    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        throw new RuntimeException("Stub!");
    }
}

