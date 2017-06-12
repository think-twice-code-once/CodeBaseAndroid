package codebase_simple.dependencies;

import dagger.Module;
import dagger.Provides;
import codebase_simple.services_local.Worker;
import codebase.annotations.ApplicationScope;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

@Module
public class CleanModule {

    @Provides
    @ApplicationScope
    Worker provideWorker() {
        return new Worker("Abc", (int) System.currentTimeMillis() % 100);
    }
}
