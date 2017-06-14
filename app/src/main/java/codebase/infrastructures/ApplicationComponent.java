package codebase.infrastructures;

import codebase.annotations.ApplicationScope;
import codebase.domains.main.MainActivity;
import dagger.Component;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/13/2017.
 */

@ApplicationScope
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MainActivity activity);
}
