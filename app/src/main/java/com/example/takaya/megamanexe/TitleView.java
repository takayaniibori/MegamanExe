package com.example.takaya.megamanexe;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.Bitmap;

import java.io.InputStream;

public class TitleView extends View {

    /**
     * コンストラクタ
     * @param context
     */
    public TitleView(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        AssetManager assets = getResources().getAssets();
        try (InputStream istream = assets.open("title_exe2.png")) {
            Bitmap bitmap = BitmapFactory.decodeStream(istream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
