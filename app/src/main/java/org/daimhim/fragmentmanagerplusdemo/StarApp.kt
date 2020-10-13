package org.daimhim.fragmentmanagerplusdemo

import android.app.Application
import timber.log.Timber

class StarApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}