package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.name);
        Button button1 = findViewById(R.id.button2);
        Button button2 = findViewById(R.id.play2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainCristals.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainNumbers.class);
                startActivity(intent);
            }
        });
        Button quit = findViewById(R.id.exitGame);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                this.finishAffinity();
            }

            private void finishAffinity() {
            }
        });
    }


}