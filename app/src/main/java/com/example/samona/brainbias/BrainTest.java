package com.example.samona.brainbias;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.samona.brainbias.questions.Question;


public class BrainTest extends ActionBarActivity
    {
    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_brain_test);
    final Question currentQuestion = BrainBias.QUESTIONS[0];
            // add public ...
    Button buttonYes = (Button) findViewById(R.id.buttonYes);
    buttonYes.setOnClickListener(new Button.OnClickListener()
            {
    public void onClick(View v)
                {
    Log.d("BrainTest", "buttonYes click");

    Intent intent = new Intent(getApplicationContext(), Result.class);
    intent.getExtras().putString("Guess", "Yes");
    intent.getExtras().putString("Answer", currentQuestion.answer);
    startActivity(intent);
                }
            });
    Button buttonNo = (Button) findViewById(R.id.buttonNo);
    buttonNo.setOnClickListener(new Button.OnClickListener()
    {
    public void onClick(View v)
        {
    Log.d("BrainTest", "buttonNo click");
    Intent result=new Intent(getApplicationContext(), Result.class);
    startActivity(result);
        }
    });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_brain_test, menu);
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

    public void buttonOnClick(View v) {
        // Do something when the button is clicked



    }
}
