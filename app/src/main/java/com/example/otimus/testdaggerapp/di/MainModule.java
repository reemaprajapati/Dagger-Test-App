package com.example.otimus.testdaggerapp.di;

import android.app.Application;

import com.example.otimus.testdaggerapp.impl.HelloServiceManager;
import com.example.otimus.testdaggerapp.api.HelloService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Otimus on 9/6/2017.
 */

@Module
public class MainModule {
    DaggerApplication mapplication;

    public MainModule(DaggerApplication application){
        mapplication=application;
    }

    @Provides
    @Singleton
    protected Application provideApplication(){
        return mapplication;
    }

    @Provides
    @Singleton
    HelloService provideHelloService(){
        return new HelloServiceManager();
    }

}
