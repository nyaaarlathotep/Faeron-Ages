package com.example.cartman.faeronages;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class RoleCreation extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_creation);

        Button buttonRace=(Button)findViewById(R.id.chooseRace);
        Button buttonFaith=(Button)findViewById(R.id.chooseFaith);
        Button buttonGo=(Button)findViewById(R.id.go);

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
        buttonGo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText ageText=(EditText)findViewById(R.id.editText);
                EditText nameText=(EditText)findViewById(R.id.editText2);
                Intent intent=new Intent(RoleCreation.this,eventlogAndClock.class);
                Character.setName(ageText.getText().toString());
                Character.setAge(nameText.getText().toString());
                startActivity(intent);
            }
        });

    }
}
