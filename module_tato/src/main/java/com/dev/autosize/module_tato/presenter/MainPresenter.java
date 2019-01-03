package com.dev.autosize.module_tato.presenter;

import com.dev.autosize.core.base.mvp.BasePresenter;
import com.dev.autosize.module_tato.contract.MainContract;
import com.dev.autosize.module_tato.model.MainMvpModel;
import com.squareup.haha.perflib.Main;

/**
 * Created by Administrator on 2019-01-02.
 */

public class MainPresenter extends BasePresenter<MainContract.View, MainContract.Model> implements MainContract.Presenter {

    @Override
    protected MainContract.Model createModel() {
        return new MainMvpModel();
    }
}
