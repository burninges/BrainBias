package com.example.samona.brainbias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by Sascharlatan on 28.03.2015.
 */
public class DefinitionActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.definiton);

        Intent intent = getIntent();
        String definition = intent.getExtras().getString("Definition");
        TextView definitionText = (TextView) findViewById(R.id.definition);
        definitionText.setText(definition);
        Button nextButton = (Button) findViewById(R.id.buttonNext);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DefinitionActivity.this, BrainTest.class));
                finish();
            }
        });
    }
}