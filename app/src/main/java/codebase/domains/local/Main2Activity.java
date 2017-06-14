package codebase.domains.local;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import codebase.domains.base.MainApplication;
import codebase_simple.dependencies.DaggerMatchComponent;
import codebase_simple.dependencies.DaggerReportComponent;
import codebase_simple.dependencies.MatchComponent;
import codebase_simple.services_local.Match;
import codeonce.thinktwice.dagger2examples.R;

public class Main2Activity extends AppCompatActivity {

    @Inject
    Match match;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MatchComponent matchComponent = DaggerMatchComponent.builder().build();
        matchComponent.createMatch().play();
        matchComponent.abcStreet().playOnStreet();

       DaggerReportComponent
                .builder()
                .matchComponent(((MainApplication)getApplication()).getMatchComponent())
                .build()
                .inject(this);

        match.play();
    }


}
