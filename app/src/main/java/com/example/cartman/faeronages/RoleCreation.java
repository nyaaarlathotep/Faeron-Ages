package com.example.cartman.faeronages;


import android.content.Intent;
import android.os.Bundle;
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

       buttonRace=(Button)findViewById(R.id.chooseRace);
       buttonFaith=(Button)findViewById(R.id.chooseFaith);
       buttonJob=(Button)findViewById(R.id.chooseJob);
       buttonGo=(Button)findViewById(R.id.go);


        buttonRace.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(RoleCreation.this,chooseRace.class);
                startActivity(intent);
            }
        });

        buttonFaith.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(RoleCreation.this,chooseFaith.class);
                startActivity(intent);
            }
        });

        buttonJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RoleCreation.this,chooseJob.class);
                startActivity(intent);
            }
        });

        buttonGo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ageText=(EditText)findViewById(R.id.editText);
                nameText=(EditText)findViewById(R.id.editText2);
                Intent intent=new Intent(RoleCreation.this,eventlogAndClock.class);
                if(!nameText.getText().equals("")) {
                    Character.setName(ageText.getText().toString() + "");
                }
                if(!ageText.getText().equals("")) {
                    Character.setAge(nameText.getText().toString() + "");
                }
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
                    startActivity(intent);
                    Character.check();
                    finish();
                }
            }
        });

    }
}
