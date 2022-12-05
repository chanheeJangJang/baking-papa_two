package com.example.bakingpapa_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class bigStep extends AppCompatActivity {

    ImageView image;
    ImageButton btn1, btn2, btn3, btn4, btn5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_step);
        setTitle("BAKING PAPA");

        image = (ImageView) findViewById(R.id.imageView14);
        btn1 = (ImageButton) findViewById(R.id.imageButton18);
        btn2 = (ImageButton) findViewById(R.id.imageButton17);
        btn3 = (ImageButton) findViewById(R.id.imageButton16);
        btn4 = (ImageButton) findViewById(R.id.imageButton15);
        btn5 = (ImageButton) findViewById(R.id.imageButton14);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), smallStep.class);
                startActivity(intent);
            }
        });



    }
}