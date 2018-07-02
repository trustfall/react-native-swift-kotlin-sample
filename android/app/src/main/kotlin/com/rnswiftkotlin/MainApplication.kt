package com.rnswiftkotlin

import android.app.Application

import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.react.shell.MainReactPackage
import com.facebook.soloader.SoLoader

import java.util.Arrays

class MainApplication : Application(), ReactApplication {

    private val mReactNativeHost = object : ReactNativeHost(this) {
        override fun getJSMainModuleName(): String {
            return "index"
        }
        override fun getUseDeveloperSupport(): Boolean = BuildConfig.DEBUG
        override fun getPackages(): List<ReactPackage> =
          Arrays.asList(
                  MainReactPackage()
          )
    }

    override fun getReactNativeHost(): ReactNativeHost = mReactNativeHost

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this,false)
    }
}
