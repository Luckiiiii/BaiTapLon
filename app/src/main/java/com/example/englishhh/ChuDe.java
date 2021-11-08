package com.example.englishhh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChuDe extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chu_de);
        AnhXa();
    }
    private void AnhXa(){
        Button tracNghiem = (Button) findViewById(R.id.trac_nghiem);
        Button next = (Button) findViewById(R.id.next);
        Button back = (Button) findViewById(R.id.back);

        tracNghiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChuDe.this,Quiz.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( ChuDe.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}