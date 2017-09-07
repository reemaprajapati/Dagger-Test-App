package com.example.otimus.testdaggerapp.di;

import com.example.otimus.testdaggerapp.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Otimus on 9/6/2017.
 */

@Singleton
@Component(modules = {MainModule.class})
public interface MainComponent {

    void inject(MainActivity mainActivity);

    static final class Initializer {
        private Initializer() {
        }


        public static MainComponent init(DaggerApplication daggerApplication) {
            return DaggerMainComponent.builder()
                    .mainModule(new MainModule(daggerApplication))
                    .build();
        }
    }
}