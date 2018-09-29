package edu.temple.worksheet3;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CanvasActivity extends AppCompatActivity {

    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        String bgColor = getIntent().getStringExtra("color");

        layout = findViewById(R.id.layout);
        layout.setBackgroundColor(Color.parseColor(bgColor));


    }
}
