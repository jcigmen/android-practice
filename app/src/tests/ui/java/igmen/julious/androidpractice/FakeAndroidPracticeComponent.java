package igmen.julious.androidpractice;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = AndroidInjectionModule.class)
@Singleton
public interface FakeAndroidPracticeComponent extends AndroidPracticeComponent {
}
