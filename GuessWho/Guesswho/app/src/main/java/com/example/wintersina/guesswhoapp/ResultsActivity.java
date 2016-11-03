package com.example.wintersina.guesswhoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

/**
 * Created by WinterSina on 11/2/16.
 */

public class ResultsActivity extends AppCompatActivity {

    TextView titleTextView;
    TextView answersTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_layout);

        titleTextView = (TextView)findViewById(R.id.title_textView);
        answersTextView = (TextView)findViewById(R.id.answer_text_view);

        titleTextView.setText(MainActivity.actions[MainActivity.indexHolder]);
        answersTextView.setText(MainActivity.names[MainActivity.indexHolder]);

    }

    public void clickme (View v){
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
    }




}
