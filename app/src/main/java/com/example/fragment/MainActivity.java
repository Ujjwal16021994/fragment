package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button fragment1,fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = findViewById(R.id.fragbtn1);
        fragment2 = findViewById(R.id.fragbtn2);

        fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              replaceFragment( new BlankFragment());
            }

        });
        fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new BlankFragment2());
            }


        });

    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager pr = getSupportFragmentManager();
        FragmentTransaction gt = ( pr).beginTransaction();
        gt.replace(R.id.frameLayout,fragment);
        gt.commit();
    }
}