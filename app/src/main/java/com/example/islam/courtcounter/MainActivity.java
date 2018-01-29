package com.example.islam.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declare variables
    int mTeam_A_Score ;
    int mTeam_B_Score ;

    // declare Views
    TextView mTeam_A_ScoreDisplay ;
    TextView mTeam_B_ScoreDisplay ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize variable
        mTeam_A_Score = 0 ;
        mTeam_B_Score = 0 ;

        // initialize Views
        mTeam_A_ScoreDisplay = findViewById(R.id.tv_teamA_score);
        mTeam_B_ScoreDisplay = findViewById(R.id.tv_teamB_score);

    }

    /**
     * Team A Edit Score Methods
     **/

    // Increment Score for team A by 3 point
    public void incrementTeam_A_Score3Point(View view) {
        mTeam_A_ScoreDisplay.setText("" + ( mTeam_A_Score += 3 ));
    }

    // Increment Score for team A by 2 point
    public void incrementTeam_A_Score2Point(View view) {
        mTeam_A_ScoreDisplay.setText("" + ( mTeam_A_Score += 2 ));
    }

    // Increment Score for team A by 1 point as free Throw
    public void incrementTeam_A_Score1Point(View view) {
        mTeam_A_ScoreDisplay.setText("" + ( mTeam_A_Score += 1 ));
    }

    /**
     * Team B Edit Score Methods
     **/

    // Increment Score for team B by 3 point
    public void incrementTeam_B_Score3Point(View view) {
        mTeam_B_ScoreDisplay.setText("" + ( mTeam_B_Score += 3 ));
    }

    // Increment Score for team B by 2 point
    public void incrementTeam_B_Score2Point(View view) {
        mTeam_B_ScoreDisplay.setText("" + ( mTeam_B_Score += 2 ));
    }

    // Increment Score for team B by 1 point as free Throw
    public void incrementTeam_B_Score1Point(View view) {
        mTeam_B_ScoreDisplay.setText("" + ( mTeam_B_Score += 1 ));
    }

    // Reset Score
    public void resetScore(View view) {
        // reset score for team A
        mTeam_A_Score = 0 ;
        mTeam_A_ScoreDisplay.setText("" + mTeam_A_Score);

        // reset Score for team B
        mTeam_B_Score = 0 ;
        mTeam_B_ScoreDisplay.setText("" + mTeam_B_Score);


    }



}
