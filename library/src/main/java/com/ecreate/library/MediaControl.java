package com.ecreate.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.MediaController;

public class MediaControl extends FrameLayout {
    public MediaControl(Context context, AttributeSet attrs) {
        super((Context)null);
        throw new RuntimeException("Stub!");
    }

    public MediaControl(Context context, boolean useFastForward) {
        super((Context)null);
        throw new RuntimeException("Stub!");
    }

    public MediaControl(Context context) {
        super((Context)null);
        throw new RuntimeException("Stub!");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        throw new RuntimeException("Stub!");
    }

    public void setMediaPlayer(MediaController.MediaPlayerControl player) {
        throw new RuntimeException("Stub!");
    }

    public void setAnchorView(View view) {
        throw new RuntimeException("Stub!");
    }

    public void show() {
        throw new RuntimeException("Stub!");
    }

    public void show(int timeout) {
        throw new RuntimeException("Stub!");
    }

    public boolean isShowing() {
        throw new RuntimeException("Stub!");
    }

    public void hide() {
        throw new RuntimeException("Stub!");
    }

    public boolean onTouchEvent(MotionEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean onTrackballEvent(MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        throw new RuntimeException("Stub!");
    }

    public void setEnabled(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }

    public void setPrevNextListeners(OnClickListener next, OnClickListener prev) {
        throw new RuntimeException("Stub!");
    }

    public interface MediaPlayerControl {
        void start();

        void pause();

        int getDuration();

        int getCurrentPosition();

        void seekTo(int var1);

        boolean isPlaying();

        int getBufferPercentage();

        boolean canPause();

        boolean canSeekBackward();

        boolean canSeekForward();

        int getAudioSessionId();
    }
}
