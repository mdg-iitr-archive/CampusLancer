package com.sdsmdg.parija.campuslancer;

import com.firebase.client.Firebase;

/**
 * Created by ashu on 20/8/16.
 */
public class SetupActivity extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
