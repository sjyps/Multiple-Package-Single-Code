package com.example.sujaysmac.singlecodemultipackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtHost = (TextView) findViewById(R.id.txtHost);
        txtHost.setText(BuildConfig.HOST);

    }
}
