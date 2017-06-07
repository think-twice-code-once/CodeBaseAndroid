package codeonce.thinktwice.dagger2examples;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

@Module(includes = PumpModule.class)
public class DripCoffeeModule {

    @Provides
    @Singleton
    Heater provideAbcHeater() {
        return new ElectricHeater();
    }
}
