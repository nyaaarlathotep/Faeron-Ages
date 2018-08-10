package com.example.cartman.faeronages;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.cartman.faeronages.game.Character;

public class campInfo extends BaseActivity {

    ProgressBar evilJustice;
    ProgressBar chaosLawful;
    int[] camp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp_info);

        camp= Character.getCamp();
        evilJustice=findViewById(R.id.evilJustice);
        chaosLawful=findViewById(R.id.chaosLawful);

        evilJustice.setProgress(camp[1]+50);
        chaosLawful.setProgress(camp[0]+50);
    }
}
