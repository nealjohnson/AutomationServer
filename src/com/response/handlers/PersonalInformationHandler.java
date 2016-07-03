package com.response.handlers;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PersonalInformationHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

        InputStream inp = Thread.currentThread().getClass().getResourceAsStream("/com/responses/personal-information_response.json");

        java.util.Scanner s = new java.util.Scanner(inp).useDelimiter("\\A");
        String msg = s.hasNext() ? s.next() : "";
        System.out.println(msg);
        System.out.println(msg.length());
        Headers responseHeaders = httpExchange.getResponseHeaders();
        responseHeaders.set("Content-Type", "application/json;charset=UTF-8");
        httpExchange.sendResponseHeaders(200, msg.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(msg.getBytes());
        os.close();
    }
}
