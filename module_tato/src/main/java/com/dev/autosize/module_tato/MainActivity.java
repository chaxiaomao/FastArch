package com.dev.autosize.module_tato;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.dev.autosize.core.base.mvc.BaseMvcActivity;
import com.dev.autosize.core.constant.BaseHost;
import com.dev.autosize.core.constant.Constant;
import com.dev.autosize.core.net.HttpHelper;
import com.dev.autosize.core.net.common_callback.INetCallback;
import com.dev.autosize.core.util.LogUtil;
import com.dev.autosize.module_tato.bean.BaseResponse;
import com.dev.autosize.module_tato.bean.TestBean;
import com.fec.core.router.arouter.RouterURLS;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Administrator on 2018-12-29.
 */

@Route(path = RouterURLS.MODULE_TATO)
public class MainActivity extends BaseMvcActivity {

    @BindView(R2.id.test_data_btn)
    Button testDataBtn;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initTitle() {

    }

    @Override
    protected void initView() {
        addDisposable(MvcModelService.getData(true, mView, service -> {
            RequestBody requestBody = RequestBody.create(MediaType.parse(Constant.CONTENT_TYPE_JSON), "{ \"com_id\":142 }");
            return service.getTestData("$2y$10$i6BopjUjfvgRqENa8uKPMuSPcwaQl1r9AODgv4tCjcTcZEAdwDBIO", requestBody);
        }, result -> LogUtil.d("数据：" + result.getData().get(0).getCatalog_name())));
    }

    @Override
    public void showError(String msg, String code) {

    }

    @Override
    public void showNormal() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showEmptyView() {

    }

    @Override
    public void showError() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R2.id.test_data_btn)
    public void onClick(View view) {
        if (view.getId() == R.id.test_data_btn) {
            initView();
        }
    }

}
