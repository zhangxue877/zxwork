package com.example.work1;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private  RecyclerView mRecyclerView;
    private  HomeAdapter mAdapter;
    private String[] names = {"小猫", "哈士奇", "小黄鸭", "小鹿", "老虎"};
    private int[] icons = {R.drawable.cat, R.drawable.siberiankusky,
            R.drawable.yellowduck, R.drawable.fawn, R.drawable.tiger};
    private String[] introduces = {
            "猫，属于猫科动物，分家猫、野猫，是全世界家庭中较为广泛的宠物。",
            "西伯利亚雪橇犬，常见别名哈士奇，昵称为二哈。",
            "鸭的体型相对较小，颈短，一些属的嘴要大些。腿位于身体后方，因而步态蹒跚。",
            "鹿科是哺乳纲偶蹄目下的一科动物。体型大小不等，为有角的反刍类。",
            "虎，大型猫科动物；毛色浅黄或棕黄色，满有黑色横纹；头圆、耳短，耳背面黑色，中央有一白斑甚显著；四肢健壮有力；尾粗长，具黑色环纹，尾端黑色。"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
//        Log.d(TAG,"Call onCreate()");
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.listshoppinglayout);
        mRecyclerView =findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new HomeAdapter ();
        mRecyclerView.setAdapter(mAdapter);
        //    private RecyclerView mRecyclerView;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.listshoppinglayout);
//        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//    }
    }
    class HomeAdapter extends  RecyclerView.Adapter<HomeAdapter.MyViewHolder>{

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view=LayoutInflater.from(MainActivity.this).inflate(R.layout.recycler_item,parent,false);
            MyViewHolder holder=new MyViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.name.setText(names[position]);
            holder.iv.setImageResource(icons[position]);
            holder.introduce.setText(introduces[position]);
        }

        @Override
        public int getItemCount() {
            return names.length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder{
            private TextView name;
            private ImageView iv;
            private TextView introduce;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                name =itemView.findViewById(R.id.name);
                iv =itemView.findViewById(R.id.iv);
                introduce =itemView.findViewById(R.id.introduce);
            }
        }
    }
}


//    private RecyclerView mRecyclerView;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.listshoppinglayout);
//        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//    }

//class TmpAdater extends RecyclerView.Adapter{
//    @Override
//    public  void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder,int position,@NonNull )
//}
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.lifecycle.ViewModelProvider;
//
//import android.content.DialogInterface;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.CompoundButton;
//import android.widget.EditText;
//import android.widget.ProgressBar;
//import android.widget.RadioGroup;
//import android.widget.Toast;
//
//import java.util.ArrayList;
//
//public class MainActivity extends AppCompatActivity implements View.OnClickListener,CompoundButton.OnCheckedChangeListener {
//    private ArrayList<String> hobbyList = new ArrayList<>();
//    private ProgressBar prb;
//    private EditText usernameView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.relativelayout2);
////        mountainArray=getResources().getStringArray()
//        initView();
//
//    }
//
//    @Override
//    public void onClick(View view) {
//        int id = view.getId();
//        switch (id) {
//            case R.id.plus_view1:
//                updateProgressView(true);
//                break;
//            case R.id.plus_view2:
//                updateProgressView(false);
//
//                break;
//            case  R.id.submit:
//                onSubmitConfirm();
//            default:
//                break;
//        }
//    }
//
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.layout1);
//////        mountainArray = getResources().getStringArray(R.array)
////        initView();
////    }
//
//    @Override
//    public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
//        String hobby = compoundButton.getText().toString();
//        if (checked) {
//            if (!hobbyList.contains(hobby)) {
//                hobbyList.add(hobby);
//            }
//        } else {
//            if (hobbyList.contains(hobby)) {
//                hobbyList.remove(hobby);
//            }
//        }
//    }
//
//    private void updateProgressView(boolean plus) {
//        int progress = prb.getProgress();
//        if (plus) {
//            progress += 10;
//            if (progress > 100) {
//                progress= 100;
//            }
//        } else {
//            progress -= 10;
//            if (progress < 0) {
//                progress = 0;
//            }
//            prb.setProgress(progress);
//        }
//
//    }
//
//    private  void onSubmitConfirm(){
//        AlertDialog dlg;
//        AlertDialog. Builder builder=new AlertDialog.Builder(this)
//         .setTitle("普通对话框")
//         .setIcon(R.mipmap.ic_launcher)
//         .setMessage("是否提交?")
//         .setPositiveButton("确定", new DialogInterface.OnClickListener() {
//             @Override
//             public void onClick(DialogInterface dialog, int which) {
//                 onSubmitConfirm();
//             }
//         })
//                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.dismiss();
//                    }
//                });
//        dlg=builder.create();
//        dlg.show();
//
//    }
//        private void initView() {
//            RadioGroup rg = findViewById(R.id.visit_place_rg);
//            rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//                @Override
//                public void onCheckedChanged(RadioGroup group, int i) {
//                    int index = -1;
//                    if (i == R.id.place1) {
//                        index = 0;
//                    } else if (i == R.id.place2) {
//                        index = 1;
//
//                    } else if (i == R.id.place3) {
//                        index = 2;
//                    }
//                    if (index >= 0) {
//                        showUIToat(""+index);
//                    }
//                }
//            });
//
//
//            CheckBox b = (CheckBox) findViewById(R.id.b);
//            CheckBox b1 = (CheckBox) findViewById(R.id.b1);
//            usernameView =(EditText)findViewById(R.id.username);
//            ProgressBar prb = findViewById(R.id.prb);
//            Button plus_view1 = findViewById(R.id.plus_view1);
//            Button plus_view2 = findViewById(R.id.plus_view2);
//            Button submitView=findViewById(R.id.submit);
//            b.setOnCheckedChangeListener(this);
//            b1.setOnCheckedChangeListener(this);
//            plus_view1.setOnClickListener(this);
//            plus_view2.setOnClickListener(this);
//            submitView.setOnClickListener(this);
//
//        }
//        private void  showUIToat ( final String info){
//
//           runOnUiThread(new Runnable() {
//               @Override
//               public void run() {
//                   Toast.makeText( MainActivity.this,"你投票的景点："+info,
//                   Toast.LENGTH_LONG).show();
//               }
//           });
//        }
//    }
//
//
//
////    b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()){
//
//
////        CheckBox b = (CheckBox)findViewById(R.id.b);
////        CheckBox b1 = (CheckBox)findViewById(R.id.b1);
////        b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////
////            }
////        });
//
//
