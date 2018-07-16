package com.example.cartman.faeronages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Roll extends AppCompatActivity {

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
                TextView textViewSTR=(TextView) findViewById(R.id.textViewSTR);
                int str=random.nextInt(15)+5;
                textViewSTR.setText(Integer.toString(str));
                TextView textViewCON=(TextView) findViewById(R.id.textViewCON);
                int con=random.nextInt(15)+5;
                textViewCON.setText(Integer.toString(con));
                TextView textViewINT=(TextView) findViewById(R.id.textViewINT);
                int intll=random.nextInt(15)+5;
                textViewINT.setText(Integer.toString(intll));
                TextView textViewDEX=(TextView) findViewById(R.id.textViewDEX);
                int dex=random.nextInt(15)+5;
                textViewDEX.setText(Integer.toString(dex));
                TextView textViewCHA=(TextView) findViewById(R.id.textViewCHA);
                int cha=random.nextInt(15)+5;
                textViewCHA.setText(Integer.toString(cha));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}
