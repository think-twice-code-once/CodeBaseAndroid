package dagger2.codebase.dependencies.provider;

import dagger.Module;
import dagger.Provides;
import dagger2.codebase.services.Advertisement;
import dagger2.codebase.annotations.ApplicationScope;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

@Module
public class StuffModule {

    @Provides
    @ApplicationScope
    Advertisement provideAdvertisement() {
        return new Advertisement("Nike");
    }
}
