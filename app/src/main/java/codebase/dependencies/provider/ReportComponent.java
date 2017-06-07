package dagger2.codebase.dependencies.provider;

import dagger.Component;
import dagger2.codebase.ui.Main2Activity;
import dagger2.codebase.annotations.ActivityScope;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/6/2017.
 */

@ActivityScope
@Component(dependencies = MatchComponent.class)
public interface ReportComponent {

    void inject(Main2Activity activity);
}
