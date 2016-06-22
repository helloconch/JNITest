package com.ndk.n;

/**
 * Created by cheyanxu on 16/6/22.
 */
public class LocalDataHelper {
    static {
        System.loadLibrary("one");
    }

    public native String getDataFromNative();
}
