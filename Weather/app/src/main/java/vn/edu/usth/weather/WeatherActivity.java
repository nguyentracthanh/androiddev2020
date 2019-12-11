package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;

import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class WeatherActivity extends AppCompatActivity {
    ImageView play_click;

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
//        MediaPlayer mediaPlayer= MediaPlayer.create(WeatherActivity.this,R.raw.mua_he_cua_em_vu);
//        mediaPlayer.start();
        androidx.appcompat.widget.Toolbar toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
//        init();
//        addListener();
    }

//    private void addListener() {
//        play_click.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                MediaPlayer mediaPlayer= MediaPlayer.create(WeatherActivity.this,R.raw.mua_he_cua_em_vu);
//                mediaPlayer.start();
//            }
//
//        });
//
//    }

//    private void init() {
//        play_click=findViewById(R.id.Play_button);
//    }
//        ForecastFragment FirstFragment=new ForecastFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.container, FirstFragment).commit();
//        ForecastFragment SecondFragment=new ForecastFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.container, SecondFragment).commit();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.refesh:
                Toast.makeText(this,"Refresh",Toast.LENGTH_LONG).show();
                return true;
            case R.id.setting:
                Toast.makeText(this,"Setting",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private class GetRequestImage extends AsyncTask<String, Integer, Bitmap> {
        private String resp;
        ProgressDialog progressDialog;
        Bitmap bitmap;

        @Override
        protected Bitmap doInBackground(String... params) {
            try {
                URL url = new URL(params[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream is = connection.getInputStream();
                bitmap = BitmapFactory.decodeStream(is);
                return bitmap;


            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;

        }

        protected void onPostExecute(Bitmap bitmap) {
            // execution of result of Long time consuming operation
            super.onPostExecute(bitmap);
            progressDialog.dismiss();
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.fragment1);
            Drawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
            linearLayout.setBackgroundDrawable(bitmapDrawable);
        }

        @Override
        protected void onPreExecute() {
            progressDialog = ProgressDialog.show(WeatherActivity.this,
                    "Updating weather...",
                    "Wait for 5 seconds!");
        }


        protected void onProgressUpdate(String... text) {
            // Do something here
        }
    }

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
