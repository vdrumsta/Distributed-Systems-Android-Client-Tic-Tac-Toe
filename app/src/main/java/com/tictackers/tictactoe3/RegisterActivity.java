package com.tictackers.tictactoe3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    private Soap soap ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        soap = new Soap();
    }
    public void register(View view){

        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}
