package com.djmosi.parselogintutorial;

import com.parse.Parse;
import com.parse.ParseACL;

import com.parse.ParseUser;

import android.app.Application;

/**
 * Created by djmosi on 12/16/15.
 */

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, "hbtlQTfV36X7dd2hSbodEHOUXjNNmXkUU8jWQm71", "Hx9eVDSuYvmAdcuw88UkmAFg0t4cnrWGpny0891o");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this
        // line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}