package com.naveen.saini.daggerlearningproject

import android.app.Application
import com.naveen.saini.daggerlearningproject.di.component.ApplicationComponent
import com.naveen.saini.daggerlearningproject.di.component.DaggerApplicationComponent
import com.naveen.saini.daggerlearningproject.di.module.ApplicationModule
import javax.inject.Inject

class MainApplication: Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        getDependencies();
    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this);
    }
}