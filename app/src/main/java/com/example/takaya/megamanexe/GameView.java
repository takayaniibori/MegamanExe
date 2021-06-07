package com.example.takaya.megamanexe;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

import com.example.takaya.megamanexe.Object.Player.Megaman;

import java.io.InputStream;

/**
 * ゲームビュー
 */
public class GameView extends View {

    private Megaman megaman;
    /**
     * コンストラクタ
     * @param context
     */
    public GameView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        AssetManager assets = getResources().getAssets();
        try (InputStream istream = assets.open("megaman/mm_exe1_b.png")){
        //try (InputStream istream = assets.open("field/battlefield_exe2.gif")){
            Bitmap bitmap = BitmapFactory.decodeStream(istream);
            megaman = new Megaman(bitmap, width, height);
        } catch (Exception e) {
            e.printStackTrace();
        }

        megaman.draw(canvas);
    }
}
