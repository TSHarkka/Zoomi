package com.example.kayttaja.zoomi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ZoomButton;
import android.widget.ZoomControls;




// http://abhiandroid.com/ui/zoomcontrols

public class ImageManipulation extends AppCompatActivity {

    ZoomButton zoomInBtn, zoomOutBtn;
    ZoomControls zoomCtrlBtn;
    ImageView imageView;
    ImageButton moveDownBtn;
    ImageButton moveUpBtn;
    ImageButton moveLeftBtn;
    ImageButton moveRightBtn;
    ImageButton flipXBtn;
    ImageButton flipYBtn;
    int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_manipulation);

        //zoomCtrlBtn = (ZoomControls) findViewById(R.id.zoomCtrlBtn);
        zoomInBtn = (ZoomButton) findViewById(R.id.zoomInBtn);
        zoomOutBtn = (ZoomButton) findViewById(R.id.zoomOutBtn);
        imageView = (ImageView) findViewById(R.id.imageView);
        moveDownBtn = (ImageButton) findViewById(R.id.moveDownBtn);
         moveUpBtn =(ImageButton) findViewById(R.id.moveUpBtn);
         moveLeftBtn =(ImageButton) findViewById(R.id.moveLeftBtn);
         moveRightBtn = (ImageButton) findViewById(R.id.moveRightBtn);
         flipXBtn = (ImageButton) findViewById(R.id.flipXBtn);
         flipYBtn = (ImageButton) findViewById(R.id.flipYBtn);
    }

    public void suurenna (View v) {
        float x = imageView.getScaleX();
        float y = imageView.getScaleY();

        imageView.setScaleX(x+1);
        imageView.setScaleY(x+1);

    }

    public void pienenna (View v) {
        float x = imageView.getScaleX();
        float y = imageView.getScaleY();

        imageView.setScaleX(x-1);
        imageView.setScaleY(x-1);
    }

    public void moveDown(View v) {
        float y = imageView.getY()+10;
        imageView.setY(y);
    }

    public void moveUp(View v) {
        float y = imageView.getY()-10;
        imageView.setY(y);
    }

    public void moveRight(View v) {
        float x = imageView.getX()+10;
        imageView.setX(x);
    }
    public void moveLeft(View v) {
        float x = imageView.getX()-10;
        imageView.setX(x);

    }

    public void flipX(View v) {
        if (imageView.getScaleX() == -1f) {
            imageView.setScaleX(1f);
        } else {
            imageView.setScaleX(-1f);
        }
    }

    public void flipY(View v) {
        if (imageView.getScaleY() == -1f) {
            imageView.setScaleY(1f);
        } else {
            imageView.setScaleY(-1f);
        }
    }
}
