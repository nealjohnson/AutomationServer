package com.server;

import com.stubs.AssignedPersonHandler;
import com.stubs.OrderstateHandler;
import com.stubs.OriginationStateHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.text.ParseException;

public class MainServer {

    public static void main(String argsp[]) throws IOException, ParseException {

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/dummy-server/orders/1/states", new OrderstateHandler(1));
        server.createContext("/dummy-server/orders/2/states", new OrderstateHandler(2));
        server.createContext("/dummy-server/orders/3/states", new OrderstateHandler(3));
        server.createContext("/dummy-server/orders/4/states", new OrderstateHandler(4));
        server.createContext("/dummy-server/orders/5/states", new OrderstateHandler(5));

        server.createContext("/dummy-server/orders/1/assigned-persons", new AssignedPersonHandler());
        server.createContext("/dummy-server/orders/2/assigned-persons", new AssignedPersonHandler());
        server.createContext("/dummy-server/orders/3/assigned-persons", new AssignedPersonHandler());
        server.createContext("/dummy-server/orders/4/assigned-persons", new AssignedPersonHandler());
        server.createContext("/dummy-server/orders/5/assigned-persons", new AssignedPersonHandler());

        server.createContext("/dummy-server/api/originationservice", new OriginationStateHandler());

        server.setExecutor(null);
        server.start();
    }

}


