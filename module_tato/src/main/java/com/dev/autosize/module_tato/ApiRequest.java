package com.dev.autosize.module_tato;

import com.dev.autosize.projectcode.constant.Constant;
import com.dev.autosize.module_tato.bean.BaseResponse;
import com.dev.autosize.module_tato.bean.FeedbackBean;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2018-12-29.
 */

public interface ApiRequest {

    @Headers({"Content-Type: application/x-www-form-urlencoded", "Accept: application/json"})
    @POST("v1/plugins/suggestion/default")
    Observable<BaseResponse<List<FeedbackBean>>> getTestData2(@Header(Constant.HEADER_KEY_AUTH) String authToken);

}
