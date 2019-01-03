package com.dev.autosize.module_tato.contract;

import com.dev.autosize.core.base.IModel;
import com.dev.autosize.core.base.IPresenter;
import com.dev.autosize.core.base.IView;

/**
 * Created by Administrator on 2019-01-02.
 */

public interface MainContract {

    interface View extends IView {

    }

    interface Presenter extends IPresenter<View> {

    }

    interface Model extends IModel {

    }

}
