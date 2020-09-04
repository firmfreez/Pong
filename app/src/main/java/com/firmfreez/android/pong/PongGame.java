package com.firmfreez.android.pong;

import android.content.Context;
import android.view.SurfaceView;

public class PongGame extends SurfaceView {

    /**
     * Конструктор (используйте new PongGame(this, size.x, size.y) для вызова
     * @param context - контекст, необходимый для SurfaceView
     * @param x - Ширина экрана
     * @param y - Высота экрана
     */
    public PongGame(Context context, int x, int y) {
        super(context);
    }


}
