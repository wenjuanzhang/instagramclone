package com.codepath.wjzhang.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Bxzy2RUizi2k574hTDnYiQamkr9Q28VppUVyLBEI")
                .clientKey("Ekkg6hbVZROAlzUQvdlpMHurrqJamR8lGQRdgFXh")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
