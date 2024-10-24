package com.naveen.saini.daggerlearningproject.di.module

import android.content.Context
import com.naveen.saini.daggerlearningproject.MainApplication
import dagger.Module
import dagger.Provides
import me.amitshekhar.dagger.learning.data.local.FileStorageService
import com.naveen.saini.daggerlearningproject.data.remote.HttpClient
import com.naveen.saini.daggerlearningproject.di.ApplicationContext
import com.naveen.saini.daggerlearningproject.di.DatabaseName
import com.naveen.saini.daggerlearningproject.di.DatabaseVersion
import com.naveen.saini.daggerlearningproject.di.NetworkApiKey
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MainApplication) {
    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return application
    }

    @Singleton
    @Provides
    fun provideHttpClient(): HttpClient {
        return HttpClient()
    }

    @Provides
    @DatabaseName
    fun provideDatabaseName(): String = "dummy_db"

    @Provides
    @DatabaseVersion
    fun provideDatabaseVersion(): Int = 1

    @Provides
    @NetworkApiKey
    fun provideApiKey(): String = "SOME_API_KEY"

    @Singleton
    @Provides
    fun provideFileStorageService(): FileStorageService {
        return FileStorageService()
    }
}