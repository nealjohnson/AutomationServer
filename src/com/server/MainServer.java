package com.server;

import com.response.handlers.AddressHandler;
import com.response.handlers.OtherServiceHandler;
import com.response.handlers.PersonalInformationHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.text.ParseException;

public class MainServer {

    public static void main(String argsp[]) throws IOException, ParseException {

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/dummy-server/user/1/address", new AddressHandler(1));
        server.createContext("/dummy-server/user/2/address", new AddressHandler(2));
        server.createContext("/dummy-server/user/3/address", new AddressHandler(3));
        server.createContext("/dummy-server/user/4/address", new AddressHandler(4));
        server.createContext("/dummy-server/user/5/address", new AddressHandler(5));

        server.createContext("/dummy-server/user/1/personal-information", new PersonalInformationHandler());
        server.createContext("/dummy-server/user/2/personal-information", new PersonalInformationHandler());
        server.createContext("/dummy-server/user/3/personal-information", new PersonalInformationHandler());
        server.createContext("/dummy-server/user/4/personal-information", new PersonalInformationHandler());
        server.createContext("/dummy-server/user/5/personal-information", new PersonalInformationHandler());

        server.createContext("/dummy-server/api/otherService", new OtherServiceHandler());

        server.setExecutor(null);
        server.start();
    }

}


