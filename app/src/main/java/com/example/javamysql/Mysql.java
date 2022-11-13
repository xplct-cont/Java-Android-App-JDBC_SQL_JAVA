package com.example.javamysql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mysql extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysql);

        View m1 = findViewById(R.id.m1);
        View m2 = findViewById(R.id.m2);
        View m3 = findViewById(R.id.m3);
        View m4 = findViewById(R.id.m4);
        View m5 = findViewById(R.id.m5);
        View m6 = findViewById(R.id.m6);
        View m7 = findViewById(R.id.m7);
        View m8 = findViewById(R.id.m8);
        View m9 = findViewById(R.id.m9);
        View m10 = findViewById(R.id.m10);
        View m11 = findViewById(R.id.m11);
        View m12 = findViewById(R.id.m12);
        View m13 = findViewById(R.id.m13);
        View m14 = findViewById(R.id.m14);
        View m15 = findViewById(R.id.m15);
        View m16 = findViewById(R.id.m16);
        View m17 = findViewById(R.id.m17);
        View m18 = findViewById(R.id.m18);
        View m19 = findViewById(R.id.m19);
        View m20 = findViewById(R.id.m20);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity1.class);
                startActivity(intent);

            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity2.class);
                startActivity(intent);
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity3.class);
                startActivity(intent);
            }
        });

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity4.class);
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity5.class);
                startActivity(intent);
            }
        });
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity6.class);
                startActivity(intent);
            }
        });
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity7.class);
                startActivity(intent);
            }
        });
        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity8.class);
                startActivity(intent);
            }
        });
        m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity9.class);
                startActivity(intent);
            }
        });
        m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity10.class);
                startActivity(intent);
            }
        });
        m11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity11.class);
                startActivity(intent);
            }
        });
        m12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity12.class);
                startActivity(intent);
            }
        });
        m13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity13.class);
                startActivity(intent);
            }
        });
        m14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity14.class);
                startActivity(intent);
            }
        });
        m15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity15.class);
                startActivity(intent);
            }
        });
        m16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity16.class);
                startActivity(intent);
            }
        });
        m17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity17.class);
                startActivity(intent);
            }
        });
        m18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity18.class);
                startActivity(intent);
            }
        });
        m19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity19.class);
                startActivity(intent);
            }
        });
        m20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mysql.this, MysqlActivity20.class);
                startActivity(intent);
            }
        });


    }
}