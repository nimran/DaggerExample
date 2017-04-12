package learn.daggersample;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by imran on 11/04/17.
 * <p>
 * DaggerSample
 */

@Module
public class MyModule {

    private final MyApp application;

    public MyModule(MyApp application) {
        this.application = application;
    }


    @Provides @Singleton SharedPreferences getPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    @Provides
    Context provideContext(){
        return application;
    }

}
