package com.example.samona.brainbias;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Result extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String choice = intent.getExtras().getString("Guess");
        String answer = intent.getExtras().getString("Answer");
        TextView resultText = (TextView) findViewById(R.id.result);
        if (choice.equals(answer)) {
            resultText.setText("Awesome!");

            TextView definitionText;
            definitionText.setText(getDefinition);


        } else {
            resultText.setText("WRONG!");
        }
        /*"Confirmation bias is only referencing and validating things that support one’s perspective and ignoring things that don’t.",
                "The scenario describes the “Ingroup Bias” where often groups tend to overestimate  the skills and abilities of its members at the expense of the unknown others.",
                "The phenomena described is the “Gambler’s Fallacy”. It is when people think there odds change based on previous events. E.G. A coin toss is always 50/50.",
                "Definition 4",
                "Definition 5",
                "Definition 6",
                "Definition 7",
                "Definition 8",
                "Definition 9",
                "Definition 10",*/


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result, menu);
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
