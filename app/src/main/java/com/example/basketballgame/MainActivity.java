package com.example.basketballgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //variables for storing the values of scores & fouls for both teams
    private int scoreA = 0;
    private int scoreB = 0;
    private int foulA = 0;
    private int foulB = 0;
    private TextView AGoals;
    private TextView BGoals;
    private TextView AFoul;
    private TextView BFoul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find the views once here instead of finding them each time you press a button
        AGoals = findViewById(R.id.AGoals);
        BGoals = findViewById(R.id.BGoals);
        AFoul = findViewById(R.id.AFoul);
        BFoul = findViewById(R.id.BFoul);
    }

    public void ResetScores(View view) {
        //reset all scores to zero
        scoreA = 0;
        scoreB = 0;
        foulA = 0;
        foulB = 0;
        AGoals.setText("" + scoreA);
        BGoals.setText("" + scoreB);
        AFoul.setText("" + foulA);
        BFoul.setText("" + foulB);
    }
    //Team A scored a goal!
    public void AScores(View view) {

        scoreA++;
        AGoals.setText("" + scoreA);
    }
    //Team A had a foul.
    public void AFouls(View view) {
        foulA++;
        AFoul.setText("" + foulA);
    }
    //Team B scored a goal!
    public void BScores(View view) {
        scoreB++;
        BGoals.setText("" + scoreB);
    }
    //Team B had a foul.
    public void BFouls(View view) {
        foulB++;
        BFoul.setText("" + foulB);
    }
    //The game ended , a message is displayed using toast
    public void Submit(View view) {

        Toast.makeText(this, "The game ended with:\n         Team A     TeamB\nScores:   " + scoreA + "              " + scoreB + "\nFouls:     " + foulA + "              " + foulB,
                Toast.LENGTH_LONG).show();
    }
}
