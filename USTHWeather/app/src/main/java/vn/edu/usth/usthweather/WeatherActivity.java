package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("onCreate", "Weather activity is being created");

        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather","It's starting");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather","It's being stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather","It's got resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather","It's being paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather","It's being resumed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Weather","It's being restarted");
    }





}


