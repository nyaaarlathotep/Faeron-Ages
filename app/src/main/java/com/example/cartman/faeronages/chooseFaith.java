package com.example.cartman.faeronages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.example.cartman.faeronages.game.Character;
import com.example.cartman.faeronages.game.faiths;

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
        mRB4= (RadioButton)findViewById(R.id.StCuthbert);
        mRB5= (RadioButton)findViewById(R.id.Olidammara);
        mRB6= (RadioButton)findViewById(R.id.Pelor);
        button=(Button)findViewById(R.id.faithBack);

        mRB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setFaith(faiths.Boccob);
                }
            }
        });
        mRB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setFaith(faiths.CorellonLarethian);
                }
            }
        });
        mRB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setFaith(faiths.Heironeous);
                }
            }
        });
        mRB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setFaith(faiths.StCuthbert);
                }
            }
        });
        mRB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Character.setFaith(faiths.Olidammara);
                }
            }
        });
        mRB6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Character.setFaith(faiths.Pelor);
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
