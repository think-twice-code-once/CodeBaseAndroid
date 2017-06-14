package codebase.domains.main;

import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.TextView;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import javax.inject.Inject;

import codebase.domains.base.BaseActivity;
import codebase.domains.base.MainApplication;
import codebase.domains.local.Main2Activity;
import codebase.models.LoginRequest;
import codebase.services_online.authentication.AuthenticationService;
import codeonce.thinktwice.dagger2examples.R;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity<MainView, MainPresenter> implements MainView {

    @Inject
    MainPresenter presenter;

    @ViewById(R.id.tv_result)
    TextView tvResult;

    @Inject
    AuthenticationService authenticationService;

    @AfterInject
    void afterInject() {
        ((MainApplication) getApplication())
                .getApplicationComponent()
                .inject(this);
    }

    @AfterViews
    void init() {
        authenticationService.login(new LoginRequest("test@gmail.com", "123456"))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(user -> {
                    tvResult.setText("Success: " + user.getAccessToken());
                    Log.d(Main2Activity.class.getSimpleName(), user.getAccessToken());
                }, this::handleError);
    }

    private void handleError(Throwable throwable) {
        tvResult.setText(throwable.getMessage());
        Log.d(Main2Activity.class.getSimpleName(), throwable.toString());

    }

    @NonNull
    @Override
    public MainPresenter createPresenter() {
        return presenter;
    }
}
