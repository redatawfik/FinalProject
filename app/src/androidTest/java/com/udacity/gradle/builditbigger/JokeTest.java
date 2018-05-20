package com.udacity.gradle.builditbigger;
import android.test.AndroidTestCase;

import java.util.concurrent.CountDownLatch;



public class JokeTest extends AndroidTestCase {


    public void test() {

        final CountDownLatch signal = new CountDownLatch(1);


        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext());
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();

        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}