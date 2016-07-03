package com.response.handlers;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AddressHandler implements HttpHandler {

    private int scenario;
    private static final Charset CHARSET = StandardCharsets.UTF_8;
    private static final String HEADER_ALLOW = "Allow";
    private static final String HEADER_CONTENT_TYPE = "Content-Type";

    public AddressHandler(int scenario) {
        this.scenario = scenario;
    }

    @Override
    public void handle(HttpExchange httpExchange) {
        try {
            System.out.println("orderState");
            String fileName = "/com/responses/Orderstate_response_" + scenario + ".json";
            System.out.println(fileName);
            InputStream inp = Thread.currentThread().getClass().getResourceAsStream(fileName);
            Scanner s = new Scanner(inp);
            String msg = "";
            while (s.hasNext()) {
                msg = msg + s.next();
            }

            System.out.println(msg);
            System.out.println(msg.length());
            Headers responseHeaders = httpExchange.getResponseHeaders();
            responseHeaders.set(HEADER_CONTENT_TYPE, String.format("application/json; charset=%s", CHARSET));
            httpExchange.sendResponseHeaders(200, msg.length());
            OutputStream os = httpExchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
