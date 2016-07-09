package com.kunalmadan.android.jokedisplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    //private ProgressBar spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_joke);
        //spinner = (ProgressBar)findViewById(R.id.progressBar1);
        //spinner.setVisibility(View.VISIBLE);
        Intent intent = this.getIntent();

        String joke = intent.getStringExtra("joke");

        Log.v("jokerr","Jokerr" + joke);
        TextView jokeText = (TextView) findViewById(R.id.jokeview);

        if(joke != null && joke.length() != 0) {
            jokeText.setText(joke);
        }
    }
}
