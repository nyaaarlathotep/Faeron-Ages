package com.example.cartman.faeronages;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cartman.faeronages.game.Character;
import com.example.cartman.faeronages.game.faiths;
import com.example.cartman.faeronages.game.jobs;


public class RoleCreation extends BaseActivity {
    EditText ageText;
    EditText nameText;
    Button buttonRace;
    Button buttonFaith;
    Button buttonJob;
    Button buttonGo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_creation);

       buttonRace=findViewById(R.id.chooseRace);
       buttonFaith=findViewById(R.id.chooseFaith);
       buttonJob=findViewById(R.id.chooseJob);
       buttonGo=findViewById(R.id.go);
       ageText=findViewById(R.id.age);
       nameText=findViewById(R.id.name);

       nameText.setText(Character.getName());
       ageText.setText(Integer.toString(Character.getAge()));


        buttonRace.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Character.setName(nameText.getText().toString());
                Character.setAge(ageText.getText().toString());
                Intent intent=new Intent(RoleCreation.this,chooseRace.class);
                Character.setRaceChecked();
                startActivity(intent);
                finish();
            }
        });

        buttonFaith.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Character.setName(nameText.getText().toString());
                Character.setAge(ageText.getText().toString());
                Intent intent=new Intent(RoleCreation.this,chooseFaith.class);
                Character.setFaithChecked();
                startActivity(intent);
                finish();
            }
        });

        buttonJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Character.setName(nameText.getText().toString());
                Character.setAge(ageText.getText().toString());
                Intent intent=new Intent(RoleCreation.this,chooseJob.class);
                Character.setJobChecked();
                startActivity(intent);
                finish();
            }
        });

        buttonGo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Character.setName(nameText.getText().toString());
                Character.setAge(ageText.getText().toString());
                if (Character.getJob().equals(jobs.paladin) &&
                        !(Character.getFaith().equals(faiths.StCuthbert) || Character.getFaith().equals(faiths.Pelor))) {
                    Toast.makeText(RoleCreation.this,  "a "+Character.getJob() + " believes in "+ Character.getFaith() +" ?" , Toast.LENGTH_SHORT).show();
                } else if (Character.getJob().equals(jobs.druid) &&
                        ! (Character.getFaith().equals(faiths.CorellonLarethian))) {
                    Toast.makeText(RoleCreation.this, "a "+Character.getJob() + " believes in "+ Character.getFaith() +" ?", Toast.LENGTH_SHORT).show();
                }else if(Character.getFaith().equals(faiths.Olidammara)&&
                        !(Character.getJob().equals(jobs.rogue)||Character.getJob().equals(jobs.cleric)||Character.getJob().equals(jobs.bard))){
                    Toast.makeText(RoleCreation.this, "a "+Character.getJob() + " believes in "+ Character.getFaith() +" ?", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(Character.allChedked()) {
                        Log.d("name",nameText.getText().toString());
                        Character.setName(nameText.getText().toString());
                        Character.setAge(ageText.getText().toString());
                        Intent intent=new Intent(RoleCreation.this,eventlogAndClock.class);
                        startActivity(intent);
                        Character.check();
                        finish();
                    }
                    else {
                        Toast.makeText(RoleCreation.this, "你是不是忘了什么事情", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
