package com.example.baitap.tuan3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.baitap.R;

import java.util.ArrayList;

public class tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    T32adapter adapter;
    ArrayList<T32Contact> ls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv.findViewById(R.id.tuan32lv);
        ls.add(new T32Contact("A","18",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("B","19",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("C","20",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("D","21",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("E","22",R.drawable.ic_launcher_background));
        adapter = new T32adapter(ls,this);
        lv.setAdapter(adapter);
    }
}