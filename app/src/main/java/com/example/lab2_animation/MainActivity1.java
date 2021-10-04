package com.example.lab2_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        findViewById(R.id.btnGo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity1.this,
                        MainActivity2.class));
                overridePendingTransition(R.anim.enter_x, R.anim.exit_x);
            }
        });
    }
}