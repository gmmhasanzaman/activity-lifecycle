package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("mainActivity","onCreate Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("mainActivity","onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("mainActivity","onResume Called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("mainActivity","onReStart Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("mainActivity","onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("mainActivity","onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("mainActivity","onDestroy Called");
    }
}
