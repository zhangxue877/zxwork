package com.example.work3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    private  final static String TAG ="FistActivity";

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_first);
//        Int
        Log.d("", "");
        setContentView(R.layout.first_layout);
        Button button1 = findViewById(R.id.Button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:13850674334"));
//                startActivity(intent);
//                Account account =new Account("张三", "M" );
//                Intent intent= new Intent(FirstActivity.this, SecondActivity.class);
//                Bundle bundle=new Bundle();
//                bundle.putParcelable("account",account);
//                intent.putExtra("Message",bundle);
//                startActivityForResult(intent,1);
                Message msg =new Message("张三","M",20);
                Intent intent= new Intent(FirstActivity.this, SecondActivity.class);
                Bundle bundle=new Bundle();
                bundle.putParcelable("msg",msg);
                intent.putExtra("Message",bundle);
               startActivity(intent);



            }
        });
//        Account account =new Account("张三",);




    }
}