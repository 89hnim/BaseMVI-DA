package m.tech.basemvi

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import m.tech.basemvi.di.DaggerAppComponent


class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }

}