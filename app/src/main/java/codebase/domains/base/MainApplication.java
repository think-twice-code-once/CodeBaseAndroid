package codebase.domains.base;

import android.support.multidex.MultiDexApplication;

import codebase.infrastructures.ApplicationComponent;
import codebase.infrastructures.ApplicationModule;
import codebase.infrastructures.DaggerApplicationComponent;
import codebase_simple.dependencies.CleanModule;
import codebase_simple.dependencies.ClubModule;
import codebase_simple.dependencies.DaggerMatchComponent;
import codebase_simple.dependencies.MatchComponent;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/6/2017.
 */

public class MainApplication extends MultiDexApplication {

    private MatchComponent matchComponent;

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        setMatchComponent(DaggerMatchComponent
                .builder()
                .clubModule(new ClubModule())
                .cleanModule(new CleanModule())
                .build());

        setApplicationComponent(DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule())
                .build());
    }

    public void setMatchComponent(MatchComponent matchComponent) {
        this.matchComponent = matchComponent;
    }

    public MatchComponent getMatchComponent() {
        return matchComponent;
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public void setApplicationComponent(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }
}
