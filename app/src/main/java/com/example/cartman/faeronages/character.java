package com.example.cartman.faeronages;

import android.os.Bundle;
import android.widget.TextView;

import com.example.cartman.faeronages.game.Character;

public class character extends BaseActivity {

    TextView str;
    TextView con;
    TextView intell;
    TextView dex;
    TextView cha;
    TextView name;
    TextView race;
    TextView job;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        str=findViewById(R.id.sstr);
        con=findViewById(R.id.ccon);
        intell=findViewById(R.id.iint);
        dex=findViewById(R.id.ddex);
        cha=findViewById(R.id.ccha);
        name=findViewById(R.id.name);
        race=findViewById(R.id.race);
        job=findViewById(R.id.job);

        str.setText(Integer.toString(Character.getStr()));
        con.setText(Character.getCon()+"");
        intell.setText(Character.getIntell()+"");
        dex.setText(Character.getDex()+"");
        cha.setText(Character.getCha()+"");
        name.setText("名字: "+Character.getName());
        race.setText("种族: "+Character.getRace().toString());
        job.setText("职业: "+Character.getJob().toString());
    }
}
