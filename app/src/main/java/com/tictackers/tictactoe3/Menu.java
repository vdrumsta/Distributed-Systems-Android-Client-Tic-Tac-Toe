package com.tictackers.tictactoe3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void host(View view){
        Intent intent = new Intent(this,Hostting.class);
        startActivity(intent);
    }
    public void join(View view){
        Intent intent = new Intent(this,Join.class);
        startActivity(intent);
    }
    public void leaderBoard(View view){
        Intent intent = new Intent(this,LeaderBoard.class);
        startActivity(intent);
    }
}
