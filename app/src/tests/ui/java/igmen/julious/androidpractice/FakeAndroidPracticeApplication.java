package igmen.julious.androidpractice;

public class FakeAndroidPracticeApplication extends AndroidPracticeApplication {

    @Override
    AndroidPracticeComponent getComponent() {
        return DaggerFakeAndroidPracticeComponent.builder().build();
    }
}
