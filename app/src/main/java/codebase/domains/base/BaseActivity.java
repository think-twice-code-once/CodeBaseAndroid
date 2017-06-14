package codebase.domains.base;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;

import org.androidannotations.annotations.EActivity;

/**
 * -> Created by phong.nguyen@beesightsoft.com on 6/13/2017.
 */

@EActivity
public abstract class BaseActivity<V extends MvpView, P extends MvpPresenter<V>> extends MvpActivity<V, P> {
}
