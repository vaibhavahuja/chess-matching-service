package com.personal.matcher.external.game_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import java.util.concurrent.TimeUnit;

@Configuration(value = "GameServiceClientConfig")
public class GameServiceClientConfig {

    @Value("${gameservice.base.url}")
    private String gameServiceUrl;

    private okhttp3.OkHttpClient getHttpClient() {
        return new okhttp3.OkHttpClient.Builder()
                .addNetworkInterceptor(chain -> {
                    okhttp3.Request request = chain
                            .request()
                            .newBuilder()
                            .addHeader("Content-Type", "application/json")
                            .build();
                    return chain.proceed(request);
                })
                .build();
    }

    @Bean
    public GameServiceClient commEngineClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(gameServiceUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getHttpClient())
                .build();
        return retrofit.create(GameServiceClient.class);
    }


}
