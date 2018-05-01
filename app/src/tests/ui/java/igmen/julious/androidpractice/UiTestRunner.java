package igmen.julious.androidpractice;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

/**
 * Allows us to provide a fake {@link AndroidPracticeComponent} that has fake provisions for UI
 * testing.
 */
public class UiTestRunner extends AndroidJUnitRunner {

    @Override
    public Application newApplication(ClassLoader cl,
                                      String className,
                                      Context context)
        throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, FakeAndroidPracticeApplication.class.getName(), context);
    }
}
