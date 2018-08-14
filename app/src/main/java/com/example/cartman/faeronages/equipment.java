package com.example.cartman.faeronages;

import android.os.Bundle;
import android.widget.TextView;

import com.example.cartman.faeronages.game.Character;

public class equipment extends BaseActivity {
    TextView helmet;
    TextView rightHand;
    TextView leftHand;
    TextView rings;
    TextView neckLace;
    TextView breastPlate;
    TextView legArmor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);

        helmet=findViewById(R.id.helmet);
        rightHand=findViewById(R.id.rightHand);
        leftHand=findViewById(R.id.leftHand);
        rings=findViewById(R.id.rings);
        neckLace=findViewById(R.id.neckLace);
        breastPlate=findViewById(R.id.breastplate);
        legArmor=findViewById(R.id.legArmor);

        String[] equipment= Character.getShownEquipments();
        helmet.setText("头部： "+equipment[0].split("\\.")[0]);
        breastPlate.setText("胸部： "+equipment[1].split("\\.")[0]);
        rightHand.setText("右手： "+equipment[3].split("\\.")[0]);
        leftHand.setText("左手： "+equipment[2].split("\\.")[0]);
        legArmor.setText("腿部： "+equipment[4].split("\\.")[0]);
        rings.setText("戒指： "+equipment[5].split("\\.")[0]);
        neckLace.setText("项链： "+equipment[6].split("\\.")[0]);


    }
}
