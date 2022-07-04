package com.muammerdiri.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.muammerdiri.landmarkbook.databinding.ActivityDetailsBinding;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {


    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");
        binding.name.setText(selectedLandmark.name);
        binding.country.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);


    }
}