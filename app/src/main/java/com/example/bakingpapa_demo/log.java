package com.example.bakingpapa_demo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class log extends AppCompatActivity {
    ImageButton imgbtn_str, imgbtn_in;
    ImageView imgpapa;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        setTitle("BAKING PAPA");

        imgbtn_str = (ImageButton) findViewById(R.id.imageButtonstrat);
        imgbtn_in = (ImageButton) findViewById(R.id.imageButtonin);

        imgpapa = (ImageView) findViewById(R.id.imageView);

        imgbtn_str.setOnClickListener(new View.OnClickListener() { //로그인창으로
            @Override //클릭해서 넘어가면 로그인 단계부터
            public void onClick(View view) {
                Intent intent = new Intent(log.this, log2.class);///////
                startActivity(intent);//////////////////////////////////
            }
        });

        imgbtn_in.setOnClickListener(new View.OnClickListener() { //회원가입창으로
            @Override  //생년월일, 전화번호, 이름, 닉네임, 아이디, 비밀번호
            public void onClick(View view) {

                Intent intent = new Intent(log.this, signup.class);///////
                startActivity(intent);//////////////////////////////////

            }
        });


    }
}