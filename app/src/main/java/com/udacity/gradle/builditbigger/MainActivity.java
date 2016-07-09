package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.example.Joker;


public class MainActivity extends ActionBarActivity {

    private ProgressBar spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.INVISIBLE);
       // new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
    }

@Override
    protected void onResume() {
    super.onResume();
    spinner.setVisibility(View.INVISIBLE);
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

    public void tellJoke(View view){

       // spinner = (ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.VISIBLE);
       // Intent intent = new Intent(this, JokeActivity.class);
        Joker joker = new Joker();
        String joke = joker.supplyJoke();
        //intent.putExtra("joke",joke);
        new EndpointsAsyncTask(this).execute(new Pair<Context, String>(this, joke));


        //Toast.makeText(this,joke, Toast.LENGTH_SHORT).show();
        //startActivity(intent);

    }


}
