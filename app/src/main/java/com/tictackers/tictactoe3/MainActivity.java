package com.tictackers.tictactoe3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.view.View;
import android.widget.TextView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Soap soap = new Soap();
       // soap.register("worm2", "pass123", "John", "Doe");


    }
    public void getLogin(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);

    }
    public void getRegister(View view){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
}
