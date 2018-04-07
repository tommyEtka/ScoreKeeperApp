package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamPistons=0;
    int scoreTeamLakers=0;

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

    public void addOnePointForPistons(View view){
        scoreTeamPistons = scoreTeamPistons +1;
        displayForPistons(scoreTeamPistons);
    }

    public void displayForLakers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.lakers_score);
        scoreView.setText(String.valueOf(score));

    }

    public void addOnePointForLakers(View view){
        scoreTeamLakers = scoreTeamLakers +1;
        displayForLakers(scoreTeamLakers);
    }


    public void resetScores(View view){
        scoreTeamLakers=0;
        scoreTeamPistons = 0;
        displayForLakers(scoreTeamLakers);
        displayForPistons(scoreTeamPistons);
    }
}
