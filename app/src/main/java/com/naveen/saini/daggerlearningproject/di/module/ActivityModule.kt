package com.naveen.saini.daggerlearningproject.di.module

import android.app.Activity
import android.content.Context
import com.naveen.saini.daggerlearningproject.di.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {
    @ActivityScope
    @Provides
    fun provideContext():Context{
        return activity
    }
}