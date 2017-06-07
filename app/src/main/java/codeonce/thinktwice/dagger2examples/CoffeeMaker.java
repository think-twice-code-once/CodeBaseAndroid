package codeonce.thinktwice.dagger2examples;

import android.util.Log;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

public class CoffeeMaker {
    private final Lazy<Heater> heater; // create only when need to use
    private final Pump pump;

    @Inject
    CoffeeMaker(Lazy<Heater> heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        heater.get().on();
        pump.pump();
        Log.d(Constants.LOG_TAG, " [_]P coffee! [_]P ");
        heater.get().off();
    }
}
