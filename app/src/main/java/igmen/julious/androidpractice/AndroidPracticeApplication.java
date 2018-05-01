package igmen.julious.androidpractice;

import android.app.Activity;
import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class AndroidPracticeApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        getComponent().inject(this);

        if (BuildConfig.DEBUG) {
            initialiseLeakCanary();
        }
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    /**
     * Default-access so it can be extended/over-ridden by a fake Application for UI testing
     */
    AndroidPracticeComponent getComponent() {
        return DaggerAndroidPracticeComponent.builder()
                                             .getApplication(this)
                                             .build();
    }

    private void initialiseLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) LeakCanary.install(this);
    }
}
