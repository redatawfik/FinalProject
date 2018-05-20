package com.udacity.gradle.builditbigger.backend;

import com.library.android.javalibrary.Joker;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {


    public String getData() {
         Joker joker = new Joker();
        return joker.getJoke();
    }

}