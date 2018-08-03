package com.example.cartman.faeronages;

import android.os.Bundle;
import android.support.annotation.StringDef;
import android.widget.TextView;

import com.example.cartman.faeronages.game.Character;

public class character extends BaseActivity {

    TextView str;
    TextView con;
    TextView intell;
    TextView dex;
    TextView cha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        str=findViewById(R.id.sstr);
        con=findViewById(R.id.ccon);
        intell=findViewById(R.id.iint);
        dex=findViewById(R.id.ddex);
        cha=findViewById(R.id.ccha);

        str.setText(Integer.toString(Character.getStr()));
        con.setText(Character.getCon()+"");
        intell.setText(Character.getIntell()+"");
        dex.setText(Character.getDex()+"");
        cha.setText(Character.getCha()+"");

    }
}
