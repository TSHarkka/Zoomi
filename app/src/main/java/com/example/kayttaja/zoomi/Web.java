package com.example.kayttaja.zoomi;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Web extends AppCompatActivity {

    Button webs1Btn;
    Button webs2Btn;
    Button webs3Btn;
    Button gotowebBtn;
    Button finishBtn;
    EditText writeUrlTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webs1Btn = (Button) findViewById(R.id.webs1Btn);
        webs2Btn = (Button) findViewById(R.id.webs2Btn);
        webs3Btn = (Button) findViewById(R.id.webs3Btn);
        gotowebBtn = (Button) findViewById(R.id.gotoWebBtn);
        finishBtn = (Button) findViewById(R.id.finishBtn);
        writeUrlTxt = (EditText) findViewById(R.id.writeUrlTxt);
    }

    public void webs1(View v) {
        Intent intent = new Intent(this, WenViewActivity.class);
        intent.putExtra("url", "http://www.google.com");
        startActivity(intent);
        //Settings.Global.url="http://www.google.com";
    }

    /*
    Intent newActivity0 = new Intent(MainActivity.this, Mywebpage.class);
    newActivity0.putExtra("title", str[position]);
    switch (position) {
    case 0:
        newActivity0.putExtra("url", "http://www.google.com");
        break;


    Uri uri = Uri.parse("http://www.google.com");
    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    startActivity(intent);
    */

    public void webs2(View v) {
        Intent intent = new Intent(this, WenViewActivity.class);
        intent.putExtra("url", "http://www.foreca.fi");
        startActivity(intent);
        //Settings.Global.url="http://www.foreca.fi";
    }

    public void webs3(View v) {
        Intent intent = new Intent(this, WenViewActivity.class);
        intent.putExtra("url", "http://www.tamk.fi");
        startActivity(intent);
        //Settings.Global.url="http://www.tamk.fi";
    }

    public void gotoWeb(View v) {
        Intent intent = new Intent(this, WenViewActivity.class);
        String url = writeUrlTxt.getText().toString();
        System.out.println(url);
        intent.putExtra("url", url);
        startActivity(intent);
    }
    public void endAction(View v) {
        finish();
    }

}