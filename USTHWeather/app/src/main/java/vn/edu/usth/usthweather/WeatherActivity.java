package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather","It's got resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather","It's got resumed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather","It's got resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather","It's got resumed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather","It's got resumed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Weather","It's got resumed");
    }

    }

}
