package com.phill.animations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void crossfadeBart(View view) {
        ImageView bart = (ImageView) findViewById(R.id.bart);
        ImageView homer = (ImageView) findViewById(R.id.homer);

        homer.animate().alpha(1f).setDuration(2000);
        bart.animate().alpha(0f).setDuration(2000);

        homer.bringToFront();
    }

    public void crossfadeHomer(View view) {
        ImageView homer = (ImageView) findViewById(R.id.homer);
        ImageView bart = (ImageView) findViewById(R.id.bart);

        bart.animate().alpha(1f).setDuration(2000);
        homer.animate().alpha(0f).setDuration(2000);

        bart.bringToFront();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
