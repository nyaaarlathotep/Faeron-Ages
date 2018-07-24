package com.example.cartman.faeronages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.example.cartman.faeronages.game.Character;
import com.example.cartman.faeronages.game.races;

public class chooseRace extends BaseActivity {
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
        setContentView(R.layout.activity_choose_race);
       mRB1= (RadioButton)findViewById(R.id.human);
       mRB2= (RadioButton)findViewById(R.id.halfLing);
       mRB3= (RadioButton)findViewById(R.id.halfOrc);
       mRB4= (RadioButton)findViewById(R.id.dwarves);
      mRB5= (RadioButton)findViewById(R.id.elf);
       mRB6= (RadioButton)findViewById(R.id.gnome);
      button=(Button)findViewById(R.id.raceBack);

        mRB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setRace(races.human);
                }
            }
        });
        mRB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setRace(races.halfLing);
                }
            }
        });
        mRB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setRace(races.halfOrc);
                }
            }
        });
        mRB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setRace(races.dwarves);
                }
            }
        });
        mRB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Character.setRace(races.elf);
                }
            }
        });
        mRB6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setRace(races.gnome);
                }
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent=new Intent(chooseRace.this,RoleCreation.class);
                startActivity(intent);

            }
        });
    }
}
