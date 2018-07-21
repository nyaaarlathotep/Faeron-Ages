package com.example.cartman.faeronages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;

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
       mRB1= (RadioButton)findViewById(R.id.Boccob);
       mRB2= (RadioButton)findViewById(R.id.St_Cuthbert);
       mRB3= (RadioButton)findViewById(R.id.Olidammara);
       mRB4= (RadioButton)findViewById(R.id.Heironeous);
      mRB5= (RadioButton)findViewById(R.id.CorellonLarethian);
       mRB6= (RadioButton)findViewById(R.id.gnome);
      button=(Button)findViewById(R.id.button3);

        mRB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setRace(mRB1.getText() + "");
                }
            }
        });
        mRB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setRace(mRB2.getText() + "");
                }
            }
        });
        mRB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setRace(mRB3.getText() + "");
                }
            }
        });
        mRB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setRace(mRB4.getText() + "");
                }
            }
        });
        mRB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Character.setRace(mRB5.getText() + "");
                }
            }
        });
        mRB6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Character.setRace(mRB6.getText() + "");
                }
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent=new Intent(chooseRace.this,RoleCreation.class);
                startActivity(intent);

            }
        });
    }
}
