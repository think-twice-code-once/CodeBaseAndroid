package codebase_simple.services_local;

import android.util.Log;

import javax.inject.Inject;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

public class Advertisement {

    @Inject
    public Advertisement() {
    }

    void advertise() {
        Log.d(Value.LOG_TAG, "Advertise: This is a good club !");
    }
}
