package com.example.baitap.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.baitap.R;

public class tuan22MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);

        lv = findViewById(R.id.tuan22lv);
        String[] arr = new String[]{"Mon 1", "Mon 2", "Mon 3", "Mon 4", "Mon 5"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        lv.setAdapter(adapter);

    }
}