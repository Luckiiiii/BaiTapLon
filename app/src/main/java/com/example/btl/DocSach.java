package com.example.btl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DocSach extends AppCompatActivity {

    ListView lvDocSach;
    ArrayList<Truyen> arrayDocSach;
    DocSachAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_sach);
        AnhXa();
        adapter = new DocSachAdapter(this, R.layout.truyen, arrayDocSach);
        lvDocSach.setAdapter(adapter);
    }
    private void AnhXa(){
        lvDocSach = (ListView) findViewById(R.id.listViewDocSach);
        arrayDocSach = new ArrayList<>();
        arrayDocSach.add(new Truyen("Topic1", "chuyen con cho", R.drawable.aaa));
        arrayDocSach.add(new Truyen("Topic2", "chuyen con cho", R.drawable.aaa));
        arrayDocSach.add(new Truyen("Topic3", "chuyen con cho", R.drawable.aaa));
        arrayDocSach.add(new Truyen("Topic4", "chuyen con cho", R.drawable.aaa));
        arrayDocSach.add(new Truyen("Topic5", "chuyen con cho", R.drawable.aaa));
    }
}