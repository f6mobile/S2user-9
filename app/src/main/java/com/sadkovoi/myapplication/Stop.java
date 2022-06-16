package com.sadkovoi.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.sadkovoi.myapplication.databinding.ActivityStopBinding;

public class Stop extends Activity {

    private TextView mTextView;
    private ActivityStopBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityStopBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}