package com.example.btl;

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
        Button docSach= (Button) findViewById(R.id.doc_sach);
        Button tuVung = (Button) findViewById(R.id.tu_vung);
        Button game = (Button) findViewById(R.id.game);
        Button next = (Button) findViewById(R.id.next);
        Button back = (Button) findViewById(R.id.back);
        docSach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( ChuDe.this, DocSach.class);
                startActivity(intent);
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