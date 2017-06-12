package codebase_simple.dependencies;

import codebase.annotations.ApplicationScope;
import codebase_simple.services_local.Advertisement;
import dagger.Module;
import dagger.Provides;

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
