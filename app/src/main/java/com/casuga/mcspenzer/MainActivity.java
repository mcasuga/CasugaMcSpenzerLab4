package com.casuga.mcspenzer;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.casuga.mcspenzer.R;

public class MainActivity extends AppCompatActivity {
    public final String TAG = "4ITF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate() method executed");

        ImageView main_imageView = findViewById(R.id.main_imageView);

        TextView main_locationChangeTextView = findViewById(R.id.main_locationChangeTextView);
        TextView main_distanceChangeTextView = findViewById(R.id.main_distanceChangeTextView);

        TextView main_titleTextView = findViewById(R.id.main_titleTextView);
        main_titleTextView.setText(R.string.image_title);

        Button main_backButton = findViewById(R.id.main_backButton);
        Button main_nextButton = findViewById(R.id.main_nextButton);

        // Load image dynamically
        main_imageView.setImageResource(R.drawable.bangui);
        Log.i(TAG, "loaded image on ImageView");

        // Set Title
        setTitle(getString(R.string.activity_life_cycle));
        Log.i(TAG, "set activity title");

        // Change location and distance
        main_locationChangeTextView.setText(R.string.location_value);
        main_distanceChangeTextView.setText(R.string.location_destination);
        Log.i(TAG, "location and destination set");

        // Set event onclick event handler to back button
        main_backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicked on back button", Toast.LENGTH_LONG).show();
                Log.i(TAG, "set onClick() event handler for back button");
            }
        });

        // Set event onclick event handler to next button
        main_nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Clicked on next button", Snackbar.LENGTH_LONG).show();
                Log.i(TAG, "set onClick() event handler for back button");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() method executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() method executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() method executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart() method executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() method executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() method executed");
    }
}
