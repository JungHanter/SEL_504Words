package com.sel.words504;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    private Toolbar toolbar = null;
    private ListView menuListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.act_main_toolbar);
        if(toolbar != null) {
            setSupportActionBar(toolbar);
            Log.d("MainActivity", "not support toolbar, so apply supportActionBar");
        }

        menuListView = (ListView)findViewById(R.id.act_main_listView);
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

    private void newActivity() {
        /*ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                activity, transitionView, DetailActivity.EXTRA_IMAGE);
        ActivityCompat.startActivity(activity, new Intent(activity, DetailActivity.class),
                options.toBundle());*/
    }
}
