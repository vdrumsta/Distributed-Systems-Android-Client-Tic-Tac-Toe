package com.tictackers.tictactoe3;

/**
 * Created by Vilius on 16/11/2017.
 */

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import android.widget.TextView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Soap {
    private static final String NAMESPACE = "http://tictactoews/";
    private static final String URL = "http://10.0.2.2:8080/WebApplication/TicTacToeWebService?wsdl";

    public void login() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "login";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                request.addProperty("username", "worm");
                request.addProperty("password", "pass123");

                SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);

                envelope.setOutputSoapObject(request);

                HttpTransportSE ht = new HttpTransportSE(URL);
                try {
                    ht.call(SOAP_ACTION, envelope);
                    SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
                    System.out.println("SUPER GOOD");
                    System.out.println(response.toString());
                } catch (Exception e) {
                    e.printStackTrace();;

                }

            }
        });
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void register(final String username, final String password, final String name, final String surname) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "register";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                request.addProperty("username", username);
                request.addProperty("password", password);
                request.addProperty("name", name);
                request.addProperty("surname", surname);

                SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);

                envelope.setOutputSoapObject(request);

                HttpTransportSE ht = new HttpTransportSE(URL);
                try {
                    ht.call(SOAP_ACTION, envelope);
                    SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
                    System.out.println("SUPER GOOD");
                    System.out.println(response.toString());
                } catch (Exception e) {
                    e.printStackTrace();;

                }

            }
        });
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
