package codebase.ui;

import android.support.multidex.MultiDexApplication;

import codebase_simple.dependencies.CleanModule;
import codebase_simple.dependencies.ClubModule;
import codebase_simple.dependencies.DaggerMatchComponent;
import codebase_simple.dependencies.MatchComponent;

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
