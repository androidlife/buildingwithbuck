package com.wordpress.laaptu.buckbuild;

import android.app.Application;
import timber.log.Timber;

/**
 */

public class BuckBuildApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();
    Timber.plant(new Timber.DebugTree());
  }
}
