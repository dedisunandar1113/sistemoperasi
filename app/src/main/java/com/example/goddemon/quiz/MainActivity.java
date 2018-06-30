package com.example.goddemon.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout windows;
    LinearLayout linux;
    LinearLayout macos;
    LinearLayout solaris;
    LinearLayout ios;
    LinearLayout chrome;
    LinearLayout unix;
    LinearLayout ibm;
    LinearLayout android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        windows = findViewById(R.id.windows);
        windows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), WindowsActivity.class));
            }
        });

        linux = findViewById(R.id.linux);
        linux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Linux.class));
            }
        });

        macos = findViewById(R.id.macos);
        macos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MacOs.class));
            }
        });

        solaris = findViewById(R.id.solaris);
        solaris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Solaris.class));
            }
        });

        ios = findViewById(R.id.ioss);
        ios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Ios.class));
            }
        });

        chrome = findViewById(R.id.chromeOs);
        chrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ChromixiumOs.class));
            }
        });

        unix = findViewById(R.id.unixfreebsd);
        unix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), UnixFree.class));
            }
        });

        ibm = findViewById(R.id.ibm);
        ibm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Ibm.class));
            }
        });

        android = findViewById(R.id.android);
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Android.class));
            }
        });
    }
}
