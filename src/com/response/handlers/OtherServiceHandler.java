package com.response.handlers;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class OtherServiceHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

        System.out.println("OriginationStateHandler");

        String msg = "[\n" +
                "  {\n" +
                "    \"otherData1\": \"val1\",\n" +
                "    \"otherData2\": 3,\n" +
                "    \"otherData3\": val2,\n" +
                "    \"otherData4\": \"val5\"\n" +
                "  }\n" +
                "]";


        httpExchange.sendResponseHeaders(200, msg.length());
        Headers responseHeaders = httpExchange.getResponseHeaders();
        responseHeaders.set("Content-Type", "application/json;charset=UTF-8");
        OutputStream os = httpExchange.getResponseBody();
        os.write(msg.getBytes());
        os.close();
    }
}

