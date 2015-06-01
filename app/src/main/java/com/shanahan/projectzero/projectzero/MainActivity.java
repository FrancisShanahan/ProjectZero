package com.shanahan.projectzero.projectzero;

import android.content.Context;
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

    public void onSpotifyClick(View view) {
        showToast("Spotify Click");
    }

    public void onScoresAppClick(View view) {
        showToast("Scores App Click");
    }

    public void onLibraryAppClick(View view) {
        showToast("Library Click");
    }

    public void onBuildItBiggerClick(View view) {
        showToast("Build It Bigger Click");
    }

    public void onXYZReaderClick(View view) {
        showToast("XYZReader Click");
    }

    public void onCapstoneClick(View view) {
        showToast("Capstone Click");
    }

    private void showToast(CharSequence text) {
        Context context = getApplicationContext();

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
