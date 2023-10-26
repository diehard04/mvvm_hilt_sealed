package com.example.hiltsealed.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication:  Application() {
}