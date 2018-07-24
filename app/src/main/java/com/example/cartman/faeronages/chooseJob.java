package com.example.cartman.faeronages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.example.cartman.faeronages.game.Character;
import com.example.cartman.faeronages.game.jobs;

public class chooseJob extends BaseActivity {

    RadioButton mRB1;
    RadioButton mRB2;
    RadioButton mRB3;
    RadioButton mRB4;
    RadioButton mRB5;
    RadioButton mRB6;
    RadioButton mRB7;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_job);

        mRB1= (RadioButton)findViewById(R.id.fighter);
        mRB2= (RadioButton)findViewById(R.id.sorcerer);
        mRB3= (RadioButton)findViewById(R.id.cleric);
        mRB4= (RadioButton)findViewById(R.id.rogue);
        mRB5= (RadioButton)findViewById(R.id.druid);
        mRB6= (RadioButton)findViewById(R.id.bard);
        mRB7=(RadioButton)findViewById(R.id.paladin);
        button=(Button)findViewById(R.id.jobBack);

        mRB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setJob(jobs.fighter);
                }
            }
        });
        mRB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setJob(jobs.sorcerer);

                }
            }
        });
        mRB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setJob(jobs.cleric);
                }
            }
        });
        mRB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setJob(jobs.rogue);

                }
            }
        });
        mRB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Character.setJob(jobs.druid);

                }
            }
        });
        mRB6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Character.setJob(jobs.bard);

                }
            }
        });
        mRB7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Character.setJob(jobs.paladin);

                }
            }
        });




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chooseJob.this,RoleCreation.class);
                startActivity(intent);
            }
        });


    }
}
