package com.example.lesson_4_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.example.lesson_4_3.databinding.ItemContinentBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_continents, new ContinentsFragment()).addToBackStack(null).commit();
    }
}