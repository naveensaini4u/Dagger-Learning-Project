package com.naveen.saini.daggerlearningproject.data.local

import android.content.Context

import com.naveen.saini.daggerlearningproject.di.ApplicationContext
import com.naveen.saini.daggerlearningproject.di.DatabaseName
import com.naveen.saini.daggerlearningproject.di.DatabaseVersion

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseService @Inject constructor(
    @ApplicationContext private val context: Context,
    @DatabaseName private val databaseName: String,
    @DatabaseVersion private val version: Int
) {

    fun getDummyData(): String {
        return "DATABASE_DUMMY_DATA"
    }

}
