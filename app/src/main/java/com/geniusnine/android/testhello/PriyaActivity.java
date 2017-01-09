package com.geniusnine.android.testhello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PriyaActivity extends Activity {
Button btnPriya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priya);
        btnPriya=(Button)findViewById(R.id.button4);
        btnPriya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PriyaActivity.this, SravaniActivity.class);
                startActivity(intent);
            }
        });
    }
}
