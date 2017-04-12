package learn.daggersample;

import android.app.Application;
import android.content.Context;

/**
 * Created by imran on 11/04/17.
 * <p>
 * DaggerSample
 */

public class MyApp extends Application {


    MyComponent myComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = DaggerMyComponent.builder().myModule(new MyModule(this)).build();

    }

    public MyComponent getMyComponent(Context context) {
        return ((MyApp) context.getApplicationContext()).myComponent;

    }
}
