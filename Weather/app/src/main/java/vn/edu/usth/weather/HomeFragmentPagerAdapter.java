package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] { "Hanoi", "Paris", "Toulouse" };
    public HomeFragmentPagerAdapter (FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int page) {
        // returns an instance of Fragment corresponding to the specified page
        switch (page) {
            case 0:
                WeatherAndForecastFragment ff1= new WeatherAndForecastFragment();
                return ff1;
            case 1:
                WeatherAndForecastFragment ff2= new WeatherAndForecastFragment();
                return ff2;
            case 2:
                WeatherAndForecastFragment ff3= new WeatherAndForecastFragment();
                return ff3;
        }
        return null; // failsafe
        }


    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    @Override
    public CharSequence getPageTitle(int position) {
// returns a tab title corresponding to the specified page
        return titles[position];
    }

}
