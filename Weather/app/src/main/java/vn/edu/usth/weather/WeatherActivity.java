package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import android.util.Log;


public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("onCreate","The weather is being created");
        ForecastFragment FirstFragment=new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, FirstFragment).commit();
        ForecastFragment SecondFragment=new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, SecondFragment).commit();

   }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart","The weather is being started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop","The weather is being stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy","The weather is being destroyed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause","The weather is being paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume","The weather is being resumed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("onRestart","The weather is being restarted");
    }

}
