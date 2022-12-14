package com.seoultech.week7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyPictureView extends View {

    String imagePath = null;
    public MyPictureView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (imagePath != null ) {
            Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
            canvas.scale(1, 1, 0, 0);
            canvas.drawBitmap(bitmap, this.getWidth() / 2 - bitmap.getWidth() / 2,
                    this.getHeight() / 2 - bitmap.getHeight() / 2, null);
            bitmap.recycle();
        }
    }
}