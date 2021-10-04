package com.example.lab2_animation;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        //below methods are used for adding enter and exit transition.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setEnterTransition(fade);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setExitTransition(fade);
        }
    }
}