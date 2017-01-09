package com.geniusnine.android.testhello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ScreenTwo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two);
    }

    protected void clk(View v){

        Toast.makeText(getApplicationContext(), "Hi This is by sunil Pawar", Toast.LENGTH_LONG).show();
    }
}
