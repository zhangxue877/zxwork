//package com.example.receiver;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.SharedPreferences;
//import android.os.Bundle;
//import android.view.View;
//
//public class SharedPresActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_shared_pres);
//
//
//    }
//    @Override
//    public void onClick(View view){
//
//        switch (view.getId()){
//            case R.id.save_date:
//                SharedPreferences sharedPreferences=getSharedPreferences("MysharedPres",m);
//                SharedPreferences.Editor editor= sharedPreferences.edit();
//                editor.putString("Name","FHY");
//                editor.putInt("Number",126633);
//                editor.apply();
//        }
//    }
//}
