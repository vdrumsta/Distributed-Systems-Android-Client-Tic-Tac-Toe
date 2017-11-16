package com.tictackers.tictactoe3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LeaderBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_board);
    }
    public void back(View view){
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}
