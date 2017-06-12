package codebase_simple.services_local;

import android.util.Log;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

public class Advertisement {
    private String name;

    public Advertisement(String name) {
        this.name = name;
    }

    void advertise() {
        Log.d(Value.LOG_TAG, "Advertise: This is a good club !");
    }
}
