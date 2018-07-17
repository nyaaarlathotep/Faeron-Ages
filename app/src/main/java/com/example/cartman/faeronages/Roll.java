package com.example.cartman.faeronages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Roll extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll);

        Button button1 =(Button) findViewById(R.id.button);
        Button button2 =(Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                Character character=new Character();
                TextView textViewSTR=(TextView) findViewById(R.id.textViewSTR);
                textViewSTR.setText(character.getStr());
                TextView textViewCON=(TextView) findViewById(R.id.textViewCON);
                textViewCON.setText(character.getCon());
                TextView textViewINT=(TextView) findViewById(R.id.textViewINT);
                textViewINT.setText(character.getIntll());
                TextView textViewDEX=(TextView) findViewById(R.id.textViewDEX);
                textViewDEX.setText(character.getDex());
                TextView textViewCHA=(TextView) findViewById(R.id.textViewCHA);
                textViewCHA.setText(character.getCha());
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
