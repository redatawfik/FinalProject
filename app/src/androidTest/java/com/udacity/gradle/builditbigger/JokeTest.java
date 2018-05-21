package com.udacity.gradle.builditbigger;
import android.test.AndroidTestCase;




public class JokeTest extends AndroidTestCase {


    public void test() {


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