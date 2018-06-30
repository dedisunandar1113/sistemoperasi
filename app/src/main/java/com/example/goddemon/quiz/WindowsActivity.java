package com.example.goddemon.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class WindowsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windows);

        Button setting=findViewById(R.id.setting);
        setting = findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), InstalWindows.class));
            }
        });
        Button win7=findViewById(R.id.win7);
        win7 = findViewById(R.id.win7);
        win7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Windows7.class));
            }
        });

        Button win8=findViewById(R.id.win8);
        win8 = findViewById(R.id.win8);
        win8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Windows8.class));
            }
        });

        Button win10=findViewById(R.id.win10);
        win10 = findViewById(R.id.win10);
        win10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Windows10.class));
            }
        });
    }
}
