package com.firmfreez.android.pong;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;

public class PongActivity extends AppCompatActivity {

    private PongGame mPongGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Point displaySize = new Point();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            getWindowManager().getDefaultDisplay().getRealSize(displaySize);
        } else {
            getWindowManager().getDefaultDisplay().getSize(displaySize);
        }

        mPongGame = new PongGame(this, displaySize.x, displaySize.y);
        setContentView(mPongGame);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}