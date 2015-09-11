package com.example.fgonzalez.developerhub.Application;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by fgonzalez on 11/09/2015.
 */
public class MyApp extends Application {

        private final String APPID = "mBjPgsDiPf6WkjEjKKDjaZfv7lCsvFQTYgEusgAq";
        private final String CLIENTKEY = "8sH5jOlbjOk4q2J4EtYnk3K0qWngppfN56ig2JEZ";


    @Override
    public void onCreate() {

        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, APPID, CLIENTKEY);

    }
}
