package com.example.cartman.faeronages;


import android.os.Bundle;
import android.widget.TextView;

import com.example.cartman.faeronages.game.Character;

public class spell extends BaseActivity{

    TextView spell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spell);

        spell=findViewById(R.id.aSpell);
        spell.setText(Character.showSpells());
    }
}
