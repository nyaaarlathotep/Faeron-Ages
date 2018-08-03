package com.example.cartman.faeronages;

import android.os.Bundle;
import android.widget.TextView;
import com.example.cartman.faeronages.game.Character;

public class bag extends BaseActivity {

    TextView bag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag);

        bag=findViewById(R.id.thingsInBag);
        bag.setText(Character.getBag());
    }
}
