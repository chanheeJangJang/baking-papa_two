package com.example.bakingpapa_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class showtotal extends AppCompatActivity {

    TextView text1;
    ImageView img1, img2, img3;
    Button btn1, btn2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showtotal);

        //  14 8   최고점 15 최저3

        text1 = (TextView) findViewById(R.id.textView4);
        img1 = (ImageView) findViewById(R.id.imageView4);  //perfect
        img2 = (ImageView) findViewById(R.id.imageView12); //good
        img3 = (ImageView) findViewById(R.id.imageView13);  //bad
        btn1 = (Button) findViewById(R.id.button3);
        btn2 = (Button) findViewById(R.id.button4);

        if(log2.gettotal().equals(15)){
            img1.setVisibility(View.VISIBLE);
            text1.setText("너무 맛있어요! 아빠 최고");

        }
        if(log2.gettotal().equals(14)){
            img1.setVisibility(View.VISIBLE);
            text1.setText("너무 맛있어요! 아빠 최고");

        }
        if(log2.gettotal().equals(13)){
            img1.setVisibility(View.VISIBLE);
            text1.setText("너무 맛있어요! 아빠 최고");

        }
        if(log2.gettotal().equals(12)){
            img1.setVisibility(View.VISIBLE);
            text1.setText("너무 맛있어요! 아빠 최고");

        }
        ////////////////////////////////////////////
        if(log2.gettotal().equals(11)){
            img2.setVisibility(View.VISIBLE);
            text1.setText("음~ 나쁘지 않아요. 잘 먹었습니다.");

        }if(log2.gettotal().equals(10)){
            img2.setVisibility(View.VISIBLE);
            text1.setText("음~ 나쁘지 않아요. 잘 먹었습니다.");

        }if(log2.gettotal().equals(9)){
            img2.setVisibility(View.VISIBLE);
            text1.setText("음~ 나쁘지 않아요. 잘 먹었습니다.");

        }
        if(log2.gettotal().equals(8)){
            img2.setVisibility(View.VISIBLE);
            text1.setText("음~ 나쁘지 않아요. 잘 먹었습니다.");

        }
        ///////////////////////////////////////////
        if(log2.gettotal().equals(7)){
            img3.setVisibility(View.VISIBLE);
            text1.setText("우엑... 맛이 이상해요.....");

        }if(log2.gettotal().equals(6)){
            img3.setVisibility(View.VISIBLE);
            text1.setText("우엑... 맛이 이상해요.....");

        }if(log2.gettotal().equals(5)){
            img3.setVisibility(View.VISIBLE);
            text1.setText("우엑... 맛이 이상해요.....");

        }if(log2.gettotal().equals(4)){
            img3.setVisibility(View.VISIBLE);
            text1.setText("우엑... 맛이 이상해요.....");
        }
        else {
            img3.setVisibility(View.VISIBLE);
            text1.setText("우엑... 맛이 이상해요.....");

        }


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(showtotal.this, smallStep.class);
                startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(showtotal.this, story2.class);
                startActivity(intent);
            }
        });



    }
}