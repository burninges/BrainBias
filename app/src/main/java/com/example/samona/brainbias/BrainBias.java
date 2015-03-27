package com.example.samona.brainbias;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.samona.brainbias.questions.Question;


public class BrainBias extends ActionBarActivity {
    //public static final Question[] QUESTIONS = new Question[] {new Question("Like coding?", "Yes")};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_bias);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Externalfont.ttf");
        TextView myTextview = (TextView)findViewById(R.id.textview1);
        myTextview.setTypeface(myTypeface);
    }

    public void buttonOnClick(View v) {
        // Do something when the button is clicked
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), BrainTest.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_brain_bias, menu);
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
}


