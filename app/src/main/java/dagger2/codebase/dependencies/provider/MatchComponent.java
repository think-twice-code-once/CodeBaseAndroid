package dagger2.codebase.dependencies.provider;

import dagger.Component;
import dagger2.codebase.services.Match;
import dagger2.codebase.services.Street;
import dagger2.codebase.annotations.ApplicationScope;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

@ApplicationScope
@Component(modules = {ClubModule.class, CleanModule.class})
public interface MatchComponent {
    Match createMatch();

    Street abcStreet();
}
