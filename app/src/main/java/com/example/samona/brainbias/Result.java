package com.example.samona.brainbias;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Result extends ActionBarActivity {

    private Runnable definitionRunnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(getApplicationContext(), DefinitionActivity.class);
            intent.putExtra("Definition", (String) getIntent().getExtras().get("Definition"));
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String choice = intent.getExtras().getString("Guess");
        String answer = intent.getExtras().getString("Answer");
        RelativeLayout resultLayout = (RelativeLayout) findViewById(R.id.resultLayout);

        if (choice.equals(answer)) {
            resultLayout.setBackgroundResource(R.drawable.awesome);
        } else {
            resultLayout.setBackgroundResource(R.drawable.loser);
        }
        delayStartDefinitionActivity();
    }

    private void delayStartDefinitionActivity() {
        Handler handler = new Handler();
        handler.postDelayed(definitionRunnable, 2000);
    }


    /*public void buttonOnClick(View v) {
        // Do something when the button is clicked
        Button button2=(Button) v;
        startActivity(new Intent(getApplicationContext(), BrainTest.class));
    }
    */

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
