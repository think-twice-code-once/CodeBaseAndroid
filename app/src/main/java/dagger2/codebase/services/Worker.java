package dagger2.codebase.services;

import android.util.Log;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

public class Worker extends Person {
    public Worker(String name, int age) {
        super(name, age);
    }

    void clean() {
        Log.d(Value.LOG_TAG, "Worker(" + getName() + " ; " + getAge() + ")  is cleaning  123...");
    }
}
