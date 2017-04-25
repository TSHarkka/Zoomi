package com.example.kayttaja.zoomi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ScrollView extends AppCompatActivity {

    ImageView playerPic1;
    TextView playerTxt1;
    TextView playerTxt2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        playerPic1 = (ImageView) findViewById(R.id.playerPic1);
        playerTxt1 = (TextView) findViewById(R.id.playerTxt1);
        playerTxt2 = (TextView) findViewById(R.id.playerTxt2);

        
    }
}
