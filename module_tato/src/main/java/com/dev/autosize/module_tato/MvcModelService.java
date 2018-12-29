package com.dev.autosize.module_tato;

import com.dev.autosize.core.base.BaseObserver;
import com.dev.autosize.core.base.IView;
import com.dev.autosize.core.constant.Constant;
import com.dev.autosize.core.net.HttpHelper;
import com.dev.autosize.core.net.common_callback.INetCallback;
import com.dev.autosize.core.util.LogUtil;
import com.dev.autosize.core.util.RxUtils;
import com.dev.autosize.module_tato.bean.BaseResponse;

import io.reactivex.Observable;


/**
 * Created by Administrator on 2018-12-29.
 */

public class MvcModelService {

    public interface MethodSelect<T> {
        Observable<BaseResponse<T>> selectM(ApiService service);
    }

    public static <T> BaseObserver<BaseResponse<T>> getData(boolean showLoading, IView view, MethodSelect<T> select, INetCallback<T> callback) {
        return select.selectM(HttpHelper.getDefault(1).create(ApiService.class))
                .compose(RxUtils.<BaseResponse<T>>rxSchedulerHelper())
                .subscribeWith(new BaseObserver<BaseResponse<T>>(view, showLoading) {

                    @Override
                    protected void onStart() {
                        super.onStart();
                        LogUtil.d("start");
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        LogUtil.d("error：" + e.getMessage().toString());
                    }

                    @Override
                    public void onNext(BaseResponse<T> response) {
                        LogUtil.d("success");
                        LogUtil.d(response.getClass().getName());
                        LogUtil.d(response.getClass().getSimpleName());
                        if (response.data == null) {
                            LogUtil.d("null");
                        }
                        // if (response.meta.getCode().equals(Constant.RESULT_CODE)) {
                        //     view.showNormal();
                        //     callback.onSuccess(response.data);
                        // } else {
                        //     view.showError();
                        // }
                    }
                });

    }

}
