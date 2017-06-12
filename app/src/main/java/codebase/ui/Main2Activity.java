package codebase.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import codeonce.thinktwice.dagger2examples.R;
import codebase.models.LoginRequest;
import codebase.network.DefaultNetworkProvider;
import codebase.network.NetworkProvider;
import codebase_simple.services_local.Match;
import codebase.services_online.authentication.AuthenticateServiceApi;
import codebase.services_online.authentication.DefaultAuthenticationService;
import codebase.util.Constants;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

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

//       DaggerReportComponent
//                .builder()
//                .matchComponent(((MainApplication)getApplication()).getMatchComponent())
//                .build()
//                .inject(this);
//
//        match.play();

        NetworkProvider networkProvider = new DefaultNetworkProvider();

        AuthenticateServiceApi authenticateServiceApi = networkProvider
                .addDefaultHeader()
                .addHeader("Accept", "application/vnd.app.avb.mobile-v1+json")
                .provideApi(Constants.BASE_API_URL, AuthenticateServiceApi.class);

        DefaultAuthenticationService defaultAuthenticationService
                = new DefaultAuthenticationService(authenticateServiceApi);

        defaultAuthenticationService.login(new LoginRequest("abc@gmail.com", "123456"))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(user -> {
                    Log.d(Main2Activity.class.getSimpleName(), user.getAccessToken());
                }, this::handleError);
    }

    private void handleError(Throwable throwable) {
        Log.d(Main2Activity.class.getSimpleName(), throwable.toString());
    }
}
