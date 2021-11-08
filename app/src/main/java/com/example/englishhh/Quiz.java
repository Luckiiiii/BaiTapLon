package com.example.englishhh;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final LinearLayout dongVat = findViewById(R.id.dongVatLayout);
        final LinearLayout thucVat = findViewById(R.id.thucVatLayout);
        final LinearLayout bienCa = findViewById(R.id.bienCaLayout);
        final LinearLayout giaDinh = findViewById(R.id.giaDinhLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        dongVat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "DongVat";

                dongVat.setBackgroundResource(R.drawable.round_back_white_stroke10);
                thucVat.setBackgroundResource(R.drawable.round_back_white10);
                bienCa.setBackgroundResource(R.drawable.round_back_white10);
                giaDinh.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        thucVat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "ThucVat";

                thucVat.setBackgroundResource(R.drawable.round_back_white_stroke10);

                dongVat.setBackgroundResource(R.drawable.round_back_white10);
                bienCa.setBackgroundResource(R.drawable.round_back_white10);
                giaDinh.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        bienCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "BienCa";

                bienCa.setBackgroundResource(R.drawable.round_back_white_stroke10);

                thucVat.setBackgroundResource(R.drawable.round_back_white10);
                dongVat.setBackgroundResource(R.drawable.round_back_white10);
                giaDinh.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        giaDinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "GiaDinh";

                giaDinh.setBackgroundResource(R.drawable.round_back_white_stroke10);

                thucVat.setBackgroundResource(R.drawable.round_back_white10);

                bienCa.setBackgroundResource(R.drawable.round_back_white10);

                dongVat.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(Quiz.this, "Please select the Topic", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(Quiz.this, QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}