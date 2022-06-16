package com.sadkovoi.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.sadkovoi.myapplication.databinding.ActivityLogoBinding;

public class logo extends Activity {


    private ActivityLogoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLogoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent logo = new Intent( this, MainActivity.class);

        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }



        }).start();




    }
}