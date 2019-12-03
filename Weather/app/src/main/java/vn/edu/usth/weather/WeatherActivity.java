package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.util.Log;

import com.google.android.material.tabs.TabLayout;


public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("onCreate","The weather is being created");
        final PagerAdapter adapter = new HomeFragmentPagerAdapter(
                getSupportFragmentManager());
        final ViewPager pager=findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(pager);
        MediaPlayer mediaPlayer= MediaPlayer.create(WeatherActivity.this,R.raw.mua_he_cua_em_vu);
        mediaPlayer.start();
    }
//        ForecastFragment FirstFragment=new ForecastFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.container, FirstFragment).commit();
//        ForecastFragment SecondFragment=new ForecastFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.container, SecondFragment).commit();



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("abc","The weather is being started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("abc","The weather is being stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("abc","The weather is being destroyed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("abc","The weather is being paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("abc","The weather is being resumed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("abc","The weather is being restarted");
    }
//    private void init(){
//        btnLogin=findViewById(R.id.btn_Longin);
//        btnRegister=findViewById(R.id.btn_register);
//        btnLogin.setOnclickListener(this);
//        btnRegister.setOnclickListener(this);
//
//    }

}
