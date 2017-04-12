package learn.daggersample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApp)getApplication()).getMyComponent(this).injectMe(this);
        preferences.edit().putString("string","Imran").apply();
        Log.e("Lets see - ",preferences.getString("string","sorry"));

    }
}
