package com.example.cartman.faeronages;

import android.os.Bundle;
import android.widget.TextView;

import com.example.cartman.faeronages.game.Character;

import java.util.ArrayList;

public class missionList extends BaseActivity {

    TextView theMissionList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_list);

        theMissionList=findViewById(R.id.theMissionList);
        String missions="未完成的任务:\n";
        ArrayList<String> sss=Character.getMission();
        for(String mission:sss){
            missions=missions.concat(mission).concat("\n");
        }
        theMissionList.setText(missions);
    }
}
