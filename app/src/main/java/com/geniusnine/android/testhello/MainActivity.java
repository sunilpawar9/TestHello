package com.geniusnine.android.testhello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected  void call(View view){

        Intent intent = new Intent(MainActivity.this, ScreenTwo.class);
        startActivity(intent);

    }
}
