package com.example.nutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        imageSlider= findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.splash, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.one, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.five, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.two,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.three, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.eigh, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

}


    }
