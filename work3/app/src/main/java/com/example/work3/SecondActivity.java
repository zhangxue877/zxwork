package com.example.work3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
//        Button button=findViewById(R.id.Button2);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent();
//                intent.putExtra("","data from SecondActivity");
//                setResult(RESULT_OK);
//                finish();
//            }
//        });
        Intent i=getIntent();
        Bundle bundle=i.getBundleExtra("message");

    }
}
