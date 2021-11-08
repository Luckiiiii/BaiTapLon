package com.example.englishhh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.banner.BannerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();

        HwAds.init(this);

        BannerView bottomBannerView = findViewById(R.id.banner);
        AdParam adParam = new AdParam.Builder().build();
        bottomBannerView.loadAd(adParam);

    }
    private void AnhXa(){
        Button coBan = (Button) findViewById(R.id.co_ban);

        coBan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChuDe.class);
                startActivity(intent);
            }
        });
    }
}