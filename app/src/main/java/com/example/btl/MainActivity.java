package com.example.btl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();

    }
    private void AnhXa(){
        Button coBan = (Button) findViewById(R.id.co_ban);
        Button trungCap = (Button) findViewById(R.id.trung_cap);
        Button nangCao = (Button) findViewById(R.id.nang_cao);
        coBan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChuDe.class);
                startActivity(intent);
            }
        });
    }
}