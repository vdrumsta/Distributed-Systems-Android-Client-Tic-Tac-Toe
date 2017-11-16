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
    private String x = "";
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
    public void newGame (final int uid){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "newGame";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                request.addProperty("uid", uid);

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
    public void joinGame(final int uid,final int gid){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "joinGame";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                request.addProperty("uid", uid);
                request.addProperty("gid", gid);


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
    public void getBoard(final int gid){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "getBoard";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                request.addProperty("gid", gid);


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
    public void getGameState(final int gid){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "getGameState";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                request.addProperty("gid", gid);


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
    public void setGameState(final int gid,final int gstate){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "setGameState";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                request.addProperty("gid", gid);
                request.addProperty("gstate", gstate);


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
    public void checkSquare(final int x,final int y,final int gid){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "checkSquare";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                request.addProperty("x", x);
                request.addProperty("y", y);
                request.addProperty("gid", gid);



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
    public void takeSquare(final int x,final int y,final int gid,final int pid){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "takeSquare";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                request.addProperty("x", x);
                request.addProperty("y", y);
                request.addProperty("gid", gid);
                request.addProperty("pid", pid);



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
    public void checkWin(final int gid){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "checkWin";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                request.addProperty("gid", gid);


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
    public void showMyOpenGames(final int uid){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "showMyOpenGames";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                request.addProperty("uid", uid);


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
    public void showAllMyGames(final String uid){

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "showAllMyGames";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                request.addProperty("uid", uid);


                SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);

                envelope.setOutputSoapObject(request);

                HttpTransportSE ht = new HttpTransportSE(URL);
                try {
                    ht.call(SOAP_ACTION, envelope);
                    SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
                    System.out.println("SUPER GOOD");
                    x = response.toString();
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
    public void leagueTable(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "leagueTable";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);


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
    public void showOpenGames(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                final String METHOD_NAME = "showOpenGames";
                final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);


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
