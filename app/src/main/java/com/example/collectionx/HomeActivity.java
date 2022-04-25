package com.example.collectionx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import java.util.ArrayList;


public class HomeActivity extends AppCompatActivity {

    ImageView back, search, food, fash,  photo, arch, art;
    Button restuarant,  fashion, p_button, archi, thing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        back = findViewById(R.id.MENU_button);
        search=findViewById(R.id.search_button);
        food=findViewById(R.id.Food);
        restuarant=findViewById(R.id.Resturant);
        fashion=findViewById(R.id.Fashion_button);
        fash=findViewById(R.id.fash11);
        photo=findViewById(R.id.photo_image);
        arch=findViewById(R.id.arch);
        art=findViewById(R.id.artThingy);
        p_button=findViewById(R.id.P_button);
        archi=findViewById(R.id.archi_button);
        thing=findViewById(R.id.Thing);

        restuarant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RestuarantActivity.class);
                startActivity(intent);
            }
        });

        fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),FashionActivity.class);
                startActivity(intent);
            }
        });

        p_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PhotographyActivity.class);
                startActivity(intent);
            }
        });

        archi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ArchitectureActivity.class);
                startActivity(intent);
            }
        });

        thing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ThingsToDoActivity.class);
                startActivity(intent);
            }
        });

    }
}