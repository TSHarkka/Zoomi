package com.example.kayttaja.zoomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Scrollview4 extends AppCompatActivity {
    ImageView playerPic1;
    TextView playerTxt1;
    TextView playerTxt2;
    Button player2Btn;
    Button player3Btn;
    Button player4Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview4);

        playerPic1 = (ImageView) findViewById(R.id.playerPic1);
        playerTxt1 = (TextView) findViewById(R.id.playerTxt1);
        playerTxt2 = (TextView) findViewById(R.id.playerTxt2);
        player2Btn = (Button) findViewById(R.id.player2Btn);
        player3Btn = (Button) findViewById(R.id.player3Btn);
        player4Btn = (Button) findViewById(R.id.player4Btn);

    }
    public void navToPlayer2(View view) {
        Intent intentToScrollview2= new Intent(this, Scrollview2.class);
        Scrollview4.this.startActivity(intentToScrollview2);
    }

    public void navToPlayer3(View view) {
        Intent intentToScrollview3 = new Intent(this, Scrollview3.class);
        Scrollview4.this.startActivity(intentToScrollview3);
    }

    public void navToPlayer4(View view) {
        Intent akt=null;
        akt = new Intent(Scrollview4.this, Scrollview.class);
        startActivity(akt);
    }
}
