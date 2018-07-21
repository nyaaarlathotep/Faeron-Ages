package com.example.cartman.faeronages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;

public class chooseFaith extends BaseActivity {

    RadioButton mRB1;
    RadioButton mRB2;
    RadioButton mRB3;
    RadioButton mRB4;
    RadioButton mRB5;
    RadioButton mRB6;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_faith);

        mRB1= (RadioButton)findViewById(R.id.Boccob);
        mRB2= (RadioButton)findViewById(R.id.CorellonLarethian);
        mRB3= (RadioButton)findViewById(R.id.Heironeous);
        mRB4= (RadioButton)findViewById(R.id.St_Cuthbert);
        mRB5= (RadioButton)findViewById(R.id.Olidammara);
        mRB6= (RadioButton)findViewById(R.id.Pelor);
        button=(Button)findViewById(R.id.faithBack);

        mRB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setFaith("魔法之神博卡布");
                }
            }
        });
        mRB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setFaith("精灵之神柯瑞隆·拉瑞斯安");
                }
            }
        });
        mRB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setFaith("勇者之神海若尼斯");
                }
            }
        });
        mRB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setFaith("惩罚之神圣·库斯伯特");
                }
            }
        });
        mRB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Character.setFaith("游荡者之神渥利达马拉");
                }
            }
        });
        mRB6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Character.setFaith("太阳神培罗");
                }
            }
        });




        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent=new Intent(chooseFaith.this,RoleCreation.class);
                startActivity(intent);

            }
        });
    }
}
