package com.ndk.n;

/**
 * Created by cheyanxu on 16/6/22.
 */
public class ServerDataHelper {
    static {
        System.loadLibrary("two");
    }

    public native String getDataFromServer();
}
