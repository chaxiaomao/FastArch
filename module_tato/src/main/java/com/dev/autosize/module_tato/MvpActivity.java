package com.dev.autosize.module_tato;

import com.dev.autosize.core.base.mvp.BaseMvpActivity;
import com.dev.autosize.module_tato.contract.MainContract;
import com.dev.autosize.module_tato.presenter.MainPresenter;

/**
 * Created by Administrator on 2018-12-30.
 */

public class MvpActivity extends BaseMvpActivity<MainContract.View, MainContract.Presenter> implements MainContract.View {

    @Override
    public MainContract.Presenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public MainContract.View createView() {
        return this;
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void initTitle() {

    }

    @Override
    protected void initView() {

    }
}
