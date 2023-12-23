package com.example.baitap.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.baitap.R;

public class Tuan11MainActivity extends AppCompatActivity {
    EditText txt1, txt2;
    Button btn1;
    TextView tv1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan11_main);
        txt1 = findViewById(R.id.tuan11txt1);
        txt2 = findViewById(R.id.tuan11txt2);
        btn1 = findViewById(R.id.tuan11btn1);
        tv1 = findViewById(R.id.tuan11tv1);

        btn1.setOnClickListener(v->{
            TinhTong();
        });
    }

    private void TinhTong() {
        String str1 = txt1.getText().toString();
        Float so1 = Float.parseFloat(str1);
        String str2 = txt2.getText().toString();
        Float so2 = Float.parseFloat(str2);
        Float tong = so1 + so2;
        tv1.setText(String.valueOf(tong));
        return;
    }
}