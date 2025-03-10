package com.sm.bansalsphere.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.sm.bansalsphere.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize your ImageSlider and other views if needed
        ImageSlider imageSlider = view.findViewById(R.id.imageSlider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.view, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.viewm, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.viewf, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.viewb, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.viewbb, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.viewu, ScaleTypes.FIT));

        // Do something with your ImageSlider and slideModels

        return view;
    }
}
