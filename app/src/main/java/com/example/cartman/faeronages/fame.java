package com.example.cartman.faeronages;

import android.os.Bundle;
import android.widget.TextView;

import com.example.cartman.faeronages.game.Character;

public class fame extends BaseActivity {

    TextView CorText;
    TextView BoccobText;
    TextView pelorText;
    TextView HeironeousText;
    TextView StCuthbertText;
    TextView OlidammaraText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fame);

        CorText=findViewById(R.id.CorText);
        BoccobText=findViewById(R.id.BoccobText);
        pelorText=findViewById(R.id.pelorText);
        HeironeousText=findViewById(R.id.HeironeousText);
        StCuthbertText=findViewById(R.id.StCuthbertText);
        OlidammaraText=findViewById(R.id.OlidammaraText);
        String a="神明未注意:"+Character.getPrestige(1,true)+"\n教会声望： "+ Character.getPrestige(1,false);
        String b="神明未注意:"+Character.getPrestige(0,true)+"\n教会声望： "+ Character.getPrestige(0,false);
        String c="神明未注意:"+Character.getPrestige(5,true)+"\n教会声望： "+ Character.getPrestige(5,false);
        String d="神明未注意:"+Character.getPrestige(2,true)+"\n教会声望： "+ Character.getPrestige(2,false);
        String e="神明未注意:"+Character.getPrestige(3,true)+"\n教会声望： "+ Character.getPrestige(3,false);
        String f="神明未注意"+Character.getPrestige(4,true)+"\n教会声望： "+ Character.getPrestige(4,false);


        CorText.setText(a);
        BoccobText.setText(b);
        pelorText.setText(c);
        HeironeousText.setText(d);
        StCuthbertText.setText(e);
        OlidammaraText.setText(f);
    }
}
