package learn.daggersample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by imran on 11/04/17.
 * <p>
 * DaggerSample
 */


@Singleton @Component(modules = {MyModule.class})

public interface MyComponent {
     void injectMe(MainActivity mainActivity);
//    public void injectApp(MyApp myApp);
}
