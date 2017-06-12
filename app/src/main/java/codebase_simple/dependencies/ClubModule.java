package codebase_simple.dependencies;

import dagger.Module;
import dagger.Provides;
import codebase_simple.services_local.Coach;
import codebase_simple.services_local.Player;
import codebase.annotations.ApplicationScope;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */
@Module(includes = StuffModule.class)
public class ClubModule {

    @Provides
    @ApplicationScope
    Coach provideGoodCoach() {
        return new Coach("Wenger", (int) System.currentTimeMillis() % 100);
    }

    @Provides
    @ApplicationScope
    Player provideStrongPlayer() {
        return new Player("Messi", (int) System.currentTimeMillis() % 100);
    }

}
