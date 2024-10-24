package com.naveen.saini.daggerlearningproject.data.remote

import android.content.Context

import com.naveen.saini.daggerlearningproject.di.ApplicationContext
import com.naveen.saini.daggerlearningproject.di.NetworkApiKey

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkService @Inject constructor(
    private val httpClient: HttpClient,
    @ApplicationContext private val context: Context,
    @NetworkApiKey private val apiKey: String
) {

    fun getDummyData(): String {
        return "NETWORK_DUMMY_DATA"
    }

}
