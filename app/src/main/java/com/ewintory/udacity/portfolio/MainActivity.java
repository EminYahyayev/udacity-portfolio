package com.ewintory.udacity.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final int[] BUTTON_ID_RES = {
            R.id.btn_spotify_streamer,
            R.id.btn_scores,
            R.id.btn_library,
            R.id.btn_build_it_bigger,
            R.id.btn_xyz_reader,
            R.id.btn_capstone
    };

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LinearLayout buttonContainer = (LinearLayout) findViewById(R.id.button_container);
        for (int i = 0; i < buttonContainer.getChildCount(); i++) {
            final Button button = (Button) buttonContainer.getChildAt(i);

            button.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    String description = button.getContentDescription().toString();
                    Toast.makeText(MainActivity.this,
                            getString(R.string.btn_click_toast, description), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
