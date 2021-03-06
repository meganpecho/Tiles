package com.androidclass.mepec_000.tiled;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.androidclass.mepec_000.tiles.R;

public class SettingsActivity extends AppCompatActivity {
    Button BackToMainFromSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        BackToMainFromSettings = (Button)findViewById(R.id.back_arrow);

        BackToMainFromSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
