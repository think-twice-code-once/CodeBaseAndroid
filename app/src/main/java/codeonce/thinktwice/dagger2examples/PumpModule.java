package codeonce.thinktwice.dagger2examples;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

@Module
public class PumpModule {

    @Singleton
    @Provides
    Pump provideOkPump(Heater heater) {
        return new Thermosiphon(heater);
    }
}
