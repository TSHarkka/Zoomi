package com.example.kayttaja.zoomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuList = (ListView) findViewById(R.id.menuList);

        String[] val_arvot = new String[] {
                "ScrollView", "ImageView" , "Web", "Lopeta sovellus"
        };

        ArrayAdapter<String> oma_adapteri = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, val_arvot);
        menuList.setAdapter(oma_adapteri);

        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int paikka, long id) {
                int kom_paikka = paikka;
                String komento = (String)  menuList.getItemAtPosition(paikka);
                Toast.makeText(getApplicationContext(), "Kohta : " + kom_paikka + " komento : " + komento, Toast.LENGTH_SHORT).show();

                Intent akt = null;
                if (kom_paikka == 0) {
                    akt = new Intent(MainActivity.this, ScrollView.class);
                    startActivity(akt);
                } else if (kom_paikka == 1) {
                    akt = new Intent(MainActivity.this, ImageManipulation.class);
                    startActivity(akt);
                } else if (kom_paikka == 2) {
                    akt = new Intent(MainActivity.this, Web.class);
                    startActivity(akt);
                } else {
                    Intent intent = new Intent();
                    setResult(RESULT_OK, intent);
                    finish();
                }
            }
        });
    }
}
