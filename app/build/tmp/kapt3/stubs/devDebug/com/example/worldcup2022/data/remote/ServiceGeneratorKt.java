package com.example.worldcup2022.data.remote;

import com.example.worldcup2022.data.remote.moshiFactories.MyKotlinJsonAdapterFactory;
import com.example.worldcup2022.data.remote.moshiFactories.MyStandardJsonAdapters;
import com.squareup.moshi.Moshi;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"contentType", "", "contentTypeValue", "timeoutConnect", "", "timeoutRead", "app_devDebug"})
public final class ServiceGeneratorKt {
    
    /**
     * Created by TruyenIT
     */
    private static final int timeoutRead = 30;
    private static final java.lang.String contentType = "Content-Type";
    private static final java.lang.String contentTypeValue = "application/json";
    private static final int timeoutConnect = 30;
}