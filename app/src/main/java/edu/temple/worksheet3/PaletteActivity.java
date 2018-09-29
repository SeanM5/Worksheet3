package edu.temple.worksheet3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class PaletteActivity extends AppCompatActivity {

    Spinner spin;
    String[] colors = {"Red", "Green", "Purple", "Yellow", "Silver"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        ColorAdapter colorAdapt = new ColorAdapter(PaletteActivity.this, colors);

        spin = findViewById(R.id.spin);
        spin.setAdapter(colorAdapt);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    return;
                } else {
                    Intent canvas = new Intent(PaletteActivity.this, CanvasActivity.class);
                    canvas.putExtra("color", ((TextView) view).getText());
                    startActivity(canvas);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }



}
