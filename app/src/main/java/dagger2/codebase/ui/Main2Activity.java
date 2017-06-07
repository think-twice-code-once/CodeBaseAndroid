package dagger2.codebase.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import codeonce.thinktwice.dagger2examples.R;
import dagger2.codebase.dependencies.provider.DaggerReportComponent;
import dagger2.codebase.services.Match;

public class Main2Activity extends AppCompatActivity {

    @Inject
    Match match;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        MatchComponent matchComponent = DaggerMatchComponent.builder().build();
//        matchComponent.createMatch().play();
//        matchComponent.abcStreet().playOnStreet();

       DaggerReportComponent
                .builder()
                .matchComponent(((MainApplication)getApplication()).getMatchComponent())
                .build()
                .inject(this);

        match.play();
    }
}
