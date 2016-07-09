package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.ExecutionException;

/**
 * Created by KUNAL on 09-07-2016.
 */
public class JokeTest extends AndroidTestCase {

    public void runTest () throws ExecutionException, InterruptedException {
        String joke ;

        String joker = "This is a not a Joke!";

        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(getContext());

        asyncTask.execute(new Pair<Context, String>(getContext(), joker));

        joke = asyncTask.get();

        Log.v("TestCode","Test"+joke);
        assertNotNull(joke);
        joke = joker;
        assertEquals(joke,joker);
    }
}
