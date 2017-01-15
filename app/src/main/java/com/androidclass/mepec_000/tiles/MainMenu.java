package com.androidclass.mepec_000.tiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    Button GoToGameModes, GoToSettings, GoToAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        GoToGameModes = (Button)findViewById(R.id.play_button);
        GoToSettings = (Button)findViewById(R.id.settings_button);
        GoToAbout = (Button)findViewById(R.id.about_button);

        GoToGameModes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, GameModes.class);
                startActivity(intent);
            }
        });

        GoToSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        GoToAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}
