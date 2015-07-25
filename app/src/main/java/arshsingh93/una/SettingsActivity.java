package arshsingh93.una;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class SettingsActivity extends AppCompatActivity {

    @InjectView(R.id.settingSelectColorButton) Button myColorButton;
    @InjectView(R.id.settingUpdateProfileButton) Button myProfUpdateButton;

    public static final String SHOW = "show";
    public static final String SHOW_COLOR_OPTIONS = "show color options";
    public static final String SHOW_UPDATE_PROFILE = "show update profile screen";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.inject(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        //TODO add option to log out

        return super.onOptionsItemSelected(item);
    }


    @OnClick (R.id.settingSelectColorButton)
    public void startSettings(View view) {
        Intent intent = new Intent(this, NoTabActivity.class);
        intent.putExtra(SHOW, SHOW_COLOR_OPTIONS);
        startActivity(intent);
    }

    @OnClick (R.id.settingUpdateProfileButton)
    public void startUpdateProfile(View view) {
        Intent intent = new Intent(this, NoTabActivity.class);
        intent.putExtra(SHOW, SHOW_UPDATE_PROFILE);
        startActivity(intent);
    }
}
