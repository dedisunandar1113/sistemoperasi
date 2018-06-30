package com.example.goddemon.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linux extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linux);

        Button debian=findViewById(R.id.debian);
        debian = findViewById(R.id.debian);
        debian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LinuxDebian.class));
            }
        });
        Button ubuntu=findViewById(R.id.ubuntu);
        ubuntu = findViewById(R.id.ubuntu);
        ubuntu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LinuxUbuntu.class));
            }
        });
    }
}
