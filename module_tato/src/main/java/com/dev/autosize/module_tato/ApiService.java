package com.dev.autosize.module_tato;

import com.dev.autosize.core.constant.Constant;
import com.dev.autosize.module_tato.bean.BaseResponse;
import com.dev.autosize.module_tato.bean.TestBean;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2018-12-29.
 */

public interface ApiService {

    @Headers({"Content-Type: application/x-www-form-urlencoded", "Accept: application/json"})
    @POST("v1/plugins/com/com-kbs/default/get-com-kbs-catalogs")
    Observable<BaseResponse<TestBean>> getTestData(@Header(Constant.HEADER_KEY_AUTH) String authToken, @Body RequestBody requestBody);

}
