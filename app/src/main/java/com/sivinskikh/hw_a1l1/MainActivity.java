package com.sivinskikh.hw_a1l1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView weatherView;



    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weatherView = findViewById(R.id.testview);
        weatherView.setText(getString(R.string.weather) + "\n" +
                getString(R.string.userLocation) + "\n" +
                getString(R.string.weatherCondition) +  "\n" +
                getString(R.string.temperature));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_LONG).show();
        Log.i("ActivityLifeCycleInfo", "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause()", Toast.LENGTH_LONG).show();
        Log.i("ActivityLifeCycleInfo", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_LONG).show();
        Log.i("ActivityLifeCycleInfo", "onStop");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_LONG).show();
        Log.i("ActivityLifeCycleInfo", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart()", Toast.LENGTH_LONG).show();
        Log.i("ActivityLifeCycleInfo", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy()", Toast.LENGTH_LONG).show();
        Log.i("ActivityLifeCycleInfo", "onDestroy");
    }
}
