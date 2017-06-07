package dagger2.codebase.dependencies.provider;

import dagger.Module;
import dagger.Provides;
import dagger2.codebase.services.Coach;
import dagger2.codebase.services.Player;
import dagger2.codebase.annotations.ApplicationScope;

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
