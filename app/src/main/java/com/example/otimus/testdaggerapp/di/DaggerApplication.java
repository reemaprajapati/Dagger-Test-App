package com.example.otimus.testdaggerapp.di;

import android.app.Application;

/**
 * Created by Otimus on 9/6/2017.
 */

public class DaggerApplication extends Application {

    private static MainComponent graph;
    private static DaggerApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        buildComponentGraph();
    }

    public static MainComponent component() {
        return graph;
    }

    public static void buildComponentGraph() {
        graph = MainComponent.Initializer.init(instance);
    }
}
