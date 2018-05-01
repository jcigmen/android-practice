package igmen.julious.androidpractice;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = AndroidInjectionModule.class)
@Singleton
public interface AndroidPracticeComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder getApplication(AndroidPracticeApplication application);
        AndroidPracticeComponent build();
    }

    void inject(AndroidPracticeApplication application);
}
