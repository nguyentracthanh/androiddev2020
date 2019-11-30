package vn.edu.usth.weather;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class WeatherAndForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // View view = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);
        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();

        ForecastFragment weatherFragment = new ForecastFragment();
        weatherFragment.setArguments(this.getArguments());

        ForecastFragment2 forecastFragment = new ForecastFragment2();
        forecastFragment.setArguments(this.getArguments());

        fragmentTransaction.replace(R.id.fragment_2, weatherFragment);
        fragmentTransaction.replace(R.id.fragment_1, forecastFragment);

        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

        fragmentTransaction.commit();

        LinearLayout fragment_weather = (LinearLayout) inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);

        return fragment_weather;
    }
    }
//    public static WeatherAndForecastFragment newInstance(int arg) {
//
//        Bundle args = new Bundle();
//        args.putInt("ARG", arg);
//
//        WeatherAndForecastFragment fragment = new WeatherAndForecastFragment();
//        fragment.setArguments(args);
//        return fragment;
//    }



