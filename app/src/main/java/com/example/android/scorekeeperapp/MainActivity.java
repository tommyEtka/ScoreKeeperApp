package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamPistons=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPistons(scoreTeamPistons);
    }

    public void displayForPistons(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pistons_score);
        scoreView.setText(String.valueOf(score));

    }
}
