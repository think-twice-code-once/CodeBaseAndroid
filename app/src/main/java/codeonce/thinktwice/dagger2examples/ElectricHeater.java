package codeonce.thinktwice.dagger2examples;

import android.util.Log;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

public class ElectricHeater implements Heater {

    boolean heating;

    @Override
    public void on() {
        Log.d(Constants.LOG_TAG, "~~~~ Heating ~~~~");
        this.heating = true;
    }

    @Override
    public void off() {
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return heating;
    }
}
