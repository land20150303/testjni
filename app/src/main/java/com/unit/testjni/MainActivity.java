package com.unit.testjni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("JniTest");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtView = (TextView) findViewById(R.id.txt);
        txtView.setTextSize(20);
        txtView.setText(getStringFromNative());

    }

    public native String getStringFromNative();
}
