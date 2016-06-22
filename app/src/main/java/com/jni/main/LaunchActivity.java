package com.jni.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ndk.n.LocalDataHelper;
import com.ndk.n.ServerDataHelper;

public class LaunchActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LocalDataHelper localDataHelper = new LocalDataHelper();
        ServerDataHelper serverDataHelper = new ServerDataHelper();
        ((TextView) findViewById(R.id.show)).setText(localDataHelper.getDataFromNative()
                + "--------" + serverDataHelper.getDataFromServer());
    }
}
