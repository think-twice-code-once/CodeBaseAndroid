package dagger2.codebase.services;

import android.util.Log;

import javax.inject.Inject;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

public class Random {

    @Inject
    Coach coach;

    void doSomething() {
        Log.d(Value.LOG_TAG, "Random person is doing something !");
        coach.makeDecision();
    }
}
