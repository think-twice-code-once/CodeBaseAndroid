package codeonce.thinktwice.dagger2examples;

import android.util.Log;

import javax.inject.Inject;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

public class Thermosiphon implements Pump {

    private final Heater heater;

    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            Log.d(Constants.LOG_TAG, "=> => Pumping => =>");
        }
    }
}
