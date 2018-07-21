package com.example.cartman.faeronages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class chooseRace extends BaseActivity {
    RadioGroup mRG = (RadioGroup)findViewById(R.id.radiogroup);
    RadioButton mRB1= (RadioButton)findViewById(R.id.human);
    RadioButton mRB2= (RadioButton)findViewById(R.id.halfling);
    RadioButton mRB3= (RadioButton)findViewById(R.id.halforc);
    RadioButton mRB4= (RadioButton)findViewById(R.id.dwar);
    RadioButton mRB5= (RadioButton)findViewById(R.id.elf);
    RadioButton mRB6= (RadioButton)findViewById(R.id.gnome);
    Button button=(Button)findViewById(R.id.button3);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_race);



        mRB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Character.setRace(mRB1.getText()+"");
            }
        });
        mRB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Character.setRace(mRB2.getText()+"");
            }
        });
        mRB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Character.setRace(mRB3.getText()+"");
            }
        });
        mRB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Character.setRace(mRB4.getText()+"");
            }
        });
        mRB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Character.setRace(mRB5.getText()+"");
            }
        });
        mRB6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Character.setRace(mRB6.getText()+"");
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent=new Intent(chooseRace.this,RoleCreation.class);
                startActivity(intent);
                Log.d("race",Character.getRace());
            }
        });
    }
}
