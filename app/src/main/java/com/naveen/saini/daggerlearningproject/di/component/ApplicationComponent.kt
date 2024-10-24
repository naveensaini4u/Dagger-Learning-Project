package com.naveen.saini.daggerlearningproject.di.component

import android.content.Context
import com.naveen.saini.daggerlearningproject.MainApplication
import com.naveen.saini.daggerlearningproject.data.local.DatabaseService
import com.naveen.saini.daggerlearningproject.data.remote.NetworkService
import com.naveen.saini.daggerlearningproject.di.ApplicationContext
import com.naveen.saini.daggerlearningproject.di.module.ApplicationModule
import dagger.Component
import me.amitshekhar.dagger.learning.data.local.FileStorageService
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(application: MainApplication)
//
//    @ApplicationContext
//    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

//    fun getFileStorageService(): FileStorageService

}