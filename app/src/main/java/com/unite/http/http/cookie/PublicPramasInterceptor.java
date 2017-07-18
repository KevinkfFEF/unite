package com.unite.http.http.cookie;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by hp on 2017/5/30.
 * <p>
 * 公用参数设置
 */

public class PublicPramasInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder builder = new Request.Builder();
        RequestBody body = new FormBody.Builder()
                .add("key", "58b205cbc01b4bc8f96f27b10ab96edf")
                .build();
        request = builder.post(body).build();
        return chain.proceed(request);
    }
}
