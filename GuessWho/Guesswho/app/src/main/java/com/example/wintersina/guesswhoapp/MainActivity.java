package com.example.wintersina.guesswhoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public static String names[] = new String[5];
    public static String actions[] = new String[5];
    private int suffler[] = new int[3];
    public static int indexHolder;

    TextView titleTextView;
    Button namesButton1;
    Button namesButton2;
    Button namesButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suffler[0] = 0;
        suffler[1] = 0;
        suffler[2] = 0;


        names[0] = "Sina";
        names[1] = "DJ";
        names[2] = "Rook";
        names[3] = "Roja";
        names[4] = "Erin";

        actions[0] = "I smoked a cig at age 6.";
        actions[1] = "I went vigan for a week, and loved it.";
        actions[2] = "I ate food out of a trash can";
        actions[3] = "I let my hair on fire";
        actions[4] = "I dined and dashed at a 5 star restaurant.";


        titleTextView = (TextView)findViewById(R.id.main_question_text_view);
        namesButton1 = (Button)findViewById(R.id.name_button1);
        namesButton2 = (Button)findViewById(R.id.name_button2);
        namesButton3 = (Button)findViewById(R.id.name_button3);

        indexHolder = 0 + (int)(Math.random() * 5);

        int indexName1 =  0 + (int)(Math.random() * 5);
        int indexName2 =  0 + (int)(Math.random() * 5);
        while (indexName1 == indexHolder){

            indexName1 =  0 + (int)(Math.random() * 5);
        }
        while (indexName2 == indexHolder || indexName2 == indexName1){
            indexName2 =  0 + (int)(Math.random() * 5);
        }
        suffler[0] = indexHolder;
        suffler[1] = indexName1;
        suffler[2] = indexName2;

        Arrays.sort(suffler);

        for ( int i = 0 ; i < suffler.length ; i++ ) {
            System.out.println(suffler[i]);
        }

        namesButton1.setText(names[suffler[0]]);
        namesButton2.setText(names[suffler[1]]);
        namesButton3.setText(names[suffler[2]]);

        titleTextView.setText(actions[indexHolder]);

    }



    public void select1(View view){
        Intent gotoNewAct = new Intent(MainActivity.this, ResultsActivity.class);
        finish();
        startActivity(gotoNewAct);

    }
    public void select2(View view){
        Intent gotoNewAct = new Intent(MainActivity.this, ResultsActivity.class);
        finish();
        startActivity(gotoNewAct);
    }
    public void select3(View view){
        Intent gotoNewAct = new Intent(MainActivity.this, ResultsActivity.class);
        finish();
        startActivity(gotoNewAct);
    }
}
