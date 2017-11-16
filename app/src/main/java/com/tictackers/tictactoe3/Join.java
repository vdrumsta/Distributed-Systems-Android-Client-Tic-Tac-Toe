package com.tictackers.tictactoe3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Join extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
    }
    public void goToGame(View view){
        Intent intent = new Intent(this,GameActivity.class);
        startActivity(intent);
    } public void back(View view){
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}
