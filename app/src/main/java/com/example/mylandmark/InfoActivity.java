package com.example.mylandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img_info;
    TextView txt_info;
    Button btn_info_back;
    int imgno = 0;
    int imgs[] = {R.drawable.info1, R.drawable.info2, R.drawable.info3, R.drawable.info4, R.drawable.info5};
    String texts[] = {"1번 설명", "2번 설명", "3번 설명", "4번 설명", "5번 설명"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        img_info.findViewById(R.id.img_info2);
        txt_info.findViewById(R.id.txt_info);
        btn_info_back = findViewById(R.id.btn_info_back);

        img_info.setImageResource(imgs[imgno]);
        txt_info.setText(imgs[imgno]);
        img_info.setOnClickListener(this);
        btn_info_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_info_back){
            finish();
        }
        else if(v.getId() == R.id.img_info2){
            imgno = ++imgno % 5;
            img_info.setImageResource(imgs[imgno]);
            txt_info.setText(texts[imgno]);
        }
    }
}