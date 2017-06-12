package codebase_simple.dependencies;

import dagger.Component;
import codebase_simple.services_local.Match;
import codebase_simple.services_local.Street;
import codebase.annotations.ApplicationScope;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/2/2017.
 */

@ApplicationScope
@Component(modules = {ClubModule.class, CleanModule.class})
public interface MatchComponent {
    Match createMatch();

    Street abcStreet();
}
