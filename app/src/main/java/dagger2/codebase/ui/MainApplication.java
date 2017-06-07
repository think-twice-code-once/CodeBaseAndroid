package dagger2.codebase.ui;

import android.support.multidex.MultiDexApplication;

import dagger2.codebase.dependencies.provider.DaggerMatchComponent;
import dagger2.codebase.dependencies.provider.CleanModule;
import dagger2.codebase.dependencies.provider.ClubModule;
import dagger2.codebase.dependencies.provider.MatchComponent;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/6/2017.
 */

public class MainApplication extends MultiDexApplication {

    private MatchComponent matchComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        setMatchComponent(DaggerMatchComponent
                .builder()
                .clubModule(new ClubModule())
                .cleanModule(new CleanModule())
                .build());
    }

    public void setMatchComponent(MatchComponent matchComponent) {
        this.matchComponent = matchComponent;
    }

    public MatchComponent getMatchComponent() {
        return matchComponent;
    }
}
