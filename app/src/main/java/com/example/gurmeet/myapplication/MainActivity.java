package com.example.gurmeet.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when user clicks the button */
    public void onUserClickButton(View view) {
        CharSequence text = "NOT_INITIALISED";
        switch (view.getId())
        {
            case R.id.spoftify_streamer:
                text = getString(R.string.spotify_app_toast);
                break;

            case R.id.score_app:
                text = getString(R.string.score_app_toast);
                break;

            case R.id.library_app:
                text = getString(R.string.library_app_toast);
                break;

            case R.id.build_it_bigger:
                text = getString(R.string.build_it_bigger_app_toast);
                break;

            case R.id.bacon_reader:
                text = getString(R.string.bacon_app_toast);
                break;

            case R.id.capstone:
                text = getString(R.string.capstone_app_toast);
                break;

            default:
        }

        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
    }

}
