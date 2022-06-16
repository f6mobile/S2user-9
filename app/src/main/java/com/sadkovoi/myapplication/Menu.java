package com.sadkovoi.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.sadkovoi.myapplication.databinding.ActivityMenuBinding;

public class Menu extends Activity {

    private TextView mTextView;
    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}