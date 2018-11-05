## Multiplatform Tic-Tac-Toe

We created a web application in NetBeans which holds the Webservice. The webservice communicates with the database through a MySQL object. The java client has a reference to the webservice with which it communicates through a port. The java client makes a method request through the port and also receives the result through the same port.

The Android client has a soap object which communicates with the Webservice. The soap object has a NAMESPACE which is the package that the webservice is in, it has a URL which is the port and the directory path for the webservice, the METHOD_NAME is the name of the method that will be called. The soap object sends the request to the webservice and receives it as well and the Android gets the response from the soap object.

Each user sends the information to the webservice which then talks to the database. The database allows for persistent data. The database allows us to save all the information for the games, the users and logins details in an easy and practical maner.
