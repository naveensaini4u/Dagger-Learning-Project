package com.naveen.saini.daggerlearningproject.di.component

import com.naveen.saini.daggerlearningproject.MainActivity
import com.naveen.saini.daggerlearningproject.di.ActivityScope
import com.naveen.saini.daggerlearningproject.di.module.ActivityModule
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
}