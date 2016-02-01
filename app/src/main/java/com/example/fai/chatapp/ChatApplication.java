package com.example.fai.chatapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Fai on 1/24/2016.
 */
public class ChatApplication extends Application {
    public static final String YOUR_APPLICATION_ID = "wicCYuXADVgJnJA97P3D5jktKJhNMNQz1OUyn175";
    public static final String YOUR_CLIENT_KEY = "74SmZ2h74DVAUPViH7QD4LVczrCaKbOda6LUby6O";
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models here
        ParseObject.registerSubclass(Message.class);
        // Existing initialization happens after all classes are registered
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }
}