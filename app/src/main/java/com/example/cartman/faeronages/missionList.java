package com.example.cartman.faeronages;

import android.os.Bundle;
import android.widget.TextView;

import com.example.cartman.faeronages.game.Character;

public class missionList extends BaseActivity {

    TextView theMissionList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_list);

        theMissionList=findViewById(R.id.theMissionList);
        String missions="";
        for(String mission:Character.getMission()){
            missions=missions.concat(mission).concat("\n");
        }
        theMissionList.setText(missions);
    }
}
