package com.androidclass.mepec_000.tiled;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.androidclass.mepec_000.tiles.R;

public class AboutActivity extends AppCompatActivity {
    Button BackToMainFromAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        BackToMainFromAbout = (Button)findViewById(R.id.back_to_main);

        BackToMainFromAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
