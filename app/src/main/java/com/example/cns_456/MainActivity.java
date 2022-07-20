package com.example.cns_456;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<keyword_class> nlist;
    private keywordAdapter keywordadapter;
    private keyword_class keywordclass;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cns_5p_02);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager());

        nlist = new ArrayList<>();
        for(int i =0; i<10; i++){
            keywordclass = new keyword_class( lawTitle+count+"제목", lawContents+ count+"내용");
            nlist.add(keywordclass);
            count++;
        }

        keywordadapter = new keywordAdapter(nlist);
        recyclerView.setAdapter(keywordadapter);
    }
}