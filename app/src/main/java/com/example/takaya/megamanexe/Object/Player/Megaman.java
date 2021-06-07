package com.example.takaya.megamanexe.Object.Player;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import com.example.takaya.megamanexe.Object.BaseObject;

import java.io.InputStream;

/**
 * ロックマンクラス
 */
public class Megaman extends BaseObject {

    private final Paint paint = new Paint();

    public Bitmap bitmapAll;
    public Bitmap bitmap;
    public Rect rect;

    public Megaman(Bitmap bitmapAll, int width, int height){
        this.bitmapAll = bitmapAll;
        this.bitmap = Bitmap.createBitmap(this.bitmapAll,159,14,34,42,null,true);

        int left = 0;
        int top = 0;
        int right = left + this.bitmap.getWidth();
        int bottom = top + this.bitmap.getHeight();
        rect = new Rect(left, top, right, bottom);
    }
    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.bitmap, rect.left, rect.top, paint);
    }

    @Override
    public void move() {

    }

}
