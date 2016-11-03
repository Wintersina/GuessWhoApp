package com.example.wintersina.guesswhoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void select1(View view){
        Intent gotoNewAct = new Intent(MainActivity.this, ResultsActivity.class);
        startActivity(gotoNewAct);

    }
    public void select2(View view){
        Intent gotoNewAct = new Intent(MainActivity.this, ResultsActivity.class);
        startActivity(gotoNewAct);
    }
    public void select3(View view){
        Intent gotoNewAct = new Intent(MainActivity.this, ResultsActivity.class);
        startActivity(gotoNewAct);
    }
}
