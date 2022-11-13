package com.example.javamysql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Java extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        View a1 = findViewById(R.id.a1);
        View a2 = findViewById(R.id.a2);
        View a3 = findViewById(R.id.a3);
        View a4 = findViewById(R.id.a4);
        View a5 = findViewById(R.id.a5);
        View a6 = findViewById(R.id.a6);
        View a7 = findViewById(R.id.a7);
        View a8 = findViewById(R.id.a8);
        View a9 = findViewById(R.id.a9);
        View a10 = findViewById(R.id.a10);
        View a11 = findViewById(R.id.a11);
        View a12 = findViewById(R.id.a12);
        View a13 = findViewById(R.id.a13);
        View a14 = findViewById(R.id.a14);
        View a15 = findViewById(R.id.a15);
        View a16 = findViewById(R.id.a16);



        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity1.class);
                startActivity(intent);

            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity2.class);
                startActivity(intent);
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity3.class);
                startActivity(intent);
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity4.class);
                startActivity(intent);
            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity5.class);
                startActivity(intent);
            }
        });

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity6.class);
                startActivity(intent);
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity7.class);
                startActivity(intent);
            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity8.class);
                startActivity(intent);
            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity9.class);
                startActivity(intent);
            }
        });
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity10.class);
                startActivity(intent);
            }
        });a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity11.class);
                startActivity(intent);
            }
        });
        a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity12.class);
                startActivity(intent);
            }
        });


        a13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity13.class);
                startActivity(intent);
            }
        });

        a14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity14.class);
                startActivity(intent);
            }
        });
        a15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity15.class);
                startActivity(intent);
            }
        });
        a16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Java.this, JavaActivity16.class);
                startActivity(intent);
            }
        });



    }
}


