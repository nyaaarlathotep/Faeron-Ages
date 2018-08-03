package com.example.cartman.faeronages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cartman.faeronages.game.Character;

public class Roll extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll);
        Character.roll();

        Button button1 =(Button) findViewById(R.id.button);
        Button button2 =(Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Character.roll();
                TextView textViewSTR=(TextView) findViewById(R.id.textViewSTR);
                textViewSTR.setText(Integer.toString(Character.getStr()));
                TextView textViewCON=(TextView) findViewById(R.id.textViewCON);
                textViewCON.setText(Character.getCon()+"");
                TextView textViewINT=(TextView) findViewById(R.id.textViewINT);
                textViewINT.setText(Character.getIntell()+"");
                TextView textViewDEX=(TextView) findViewById(R.id.textViewDEX);
                textViewDEX.setText(Character.getDex()+"");
                TextView textViewCHA=(TextView) findViewById(R.id.textViewCHA);
                textViewCHA.setText(Character.getCha()+"");
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Roll.this,RoleCreation.class);
                startActivity(intent);
            }
        });
    }

}
