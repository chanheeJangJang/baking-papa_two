package com.example.bakingpapa_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class smallStep extends AppCompatActivity {


    ImageButton imgbtn1, imgbtn2;
    CardView card;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small_step);
        setTitle("BAKING PAPA");

        imgbtn1 = (ImageButton) findViewById(R.id.imageButton);
        imgbtn2 = (ImageButton) findViewById(R.id.imageButton13);//사라졌다가 다시 나오는 보라색 이미지
        card = (CardView) findViewById(R.id.card);

        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), story.class);
                startActivity(intent);
            }
        });




        if (log2.gettotal().equals("0")) {
            //그냥 토탈이 0이 아닐 경우를 위해서 걍 있는 구문임
        }
        else {//////////////일단 sub창으로 가게 했는데 다음 스토리 보드로 가게해야함
            card.setVisibility(View.VISIBLE);
            imgbtn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                     Intent intent = new Intent(getApplicationContext(), story2.class);
                     startActivity(intent);
                }
            });
        }







    }
}