package com.app.kotlindemo.di.modules


import com.app.kotlindemo.data.network.ApiHelper
import com.app.kotlindemo.di.WithOutAuth
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber

import javax.inject.Singleton
import java.util.concurrent.TimeUnit


/**
 * Created by svk on 5/6/17.
 */
@Module
class NetworkModule(private val baseUrl: String) {

    @Singleton
    @Provides
    internal fun provideRetrofit(@WithOutAuth httpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient)
            .build()
    }

    /*  @Singleton
    @Provides
    @WithAuth
    OkHttpClient provideHttpClient(HttpLoggingInterceptor logging, BasicAuthInterceptor interceptor){

        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);
        httpClient.addInterceptor(interceptor);
        httpClient.connectTimeout(200, TimeUnit.SECONDS);
        httpClient.readTimeout(200, TimeUnit.SECONDS);
        return httpClient.build();

    }*/

    @Singleton
    @Provides
    @WithOutAuth
    internal fun provideHttpClientWithoutAuth(logging: HttpLoggingInterceptor): OkHttpClient {
        logging.level = HttpLoggingInterceptor.Level.BODY
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)
        httpClient.connectTimeout(200, TimeUnit.SECONDS)
        httpClient.readTimeout(200, TimeUnit.SECONDS)
        return httpClient.build()

    }

    @Singleton
    @Provides
    internal fun provideLogInterceptor(): HttpLoggingInterceptor {

        return HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message -> Timber.tag("OkHttp").d(message) })
    }

    /*   @Singleton
    @Provides
    BasicAuthInterceptor provideAuthInterceptor(){
        return new BasicAuthInterceptor(Constants.USERNAME, Constants.APP_SECRET);
    }*/

    @Singleton
    @Provides
    internal fun provideApiHelper(retrofit: Retrofit): ApiHelper {
        return retrofit.create(ApiHelper::class.java)
    }
}
