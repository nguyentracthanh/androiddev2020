package vn.edu.usth.weather;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       return inflater.inflate(R.layout.fragment_forecast, container, false);

//        View v= new View(getContext());
//        v.setBackgroundColor(0x2000FF00);
//        return v;
//        TextView textview = new TextView(getActivity());
//        textview.setText("Thursday");
//        textview.setTextSize(32);
//        textview.setGravity(View.TEXT_ALIGNMENT_CENTER);
//        return textview;
    }
}





