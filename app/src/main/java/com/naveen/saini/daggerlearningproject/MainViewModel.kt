package com.naveen.saini.daggerlearningproject

import com.naveen.saini.daggerlearningproject.data.local.DatabaseService
import com.naveen.saini.daggerlearningproject.data.remote.NetworkService
import com.naveen.saini.daggerlearningproject.di.ActivityScope
import javax.inject.Inject


@ActivityScope
class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {

    fun getSomeData(): String {
        return "dsHashCode: " + databaseService.hashCode() + "\n" + "nsHashCode: " + networkService.hashCode()
    }

}
