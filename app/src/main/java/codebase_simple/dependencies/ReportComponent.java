package codebase_simple.dependencies;

import dagger.Component;
import codebase.domains.local.Main2Activity;
import codebase.annotations.ActivityScope;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/6/2017.
 */

@ActivityScope
@Component(dependencies = MatchComponent.class)
public interface ReportComponent {

    void inject(Main2Activity activity);
}
