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

        String msg = "{\n" +
                "        \"name\": \"Jims Florist\",\n" +
                "        \"id\": 8274341,\n" +
                "        \"applicationVersion\": \"1\",\n" +
                "        \"applicationStatus\": \"AUTO_APPROVED\",\n" +
                "        \"assessmentSummary\": {\n" +
                "        \"viewEntities\": [\n" +
                "        {\n" +
                "        \"entityName\": \"Bartell, Casper and Kiehn\",\n" +
                "        \"customerId\": \"2009\",\n" +
                "        \"relationShipToBorrower\": \"Guarantor\",\n" +
                "        \"cpId\": \"S0001\",\n" +
                "        \"clg\": 5519571,\n" +
                "        \"existingCutomer\": \"yes\",\n" +
                "        \"entityType\": \"Business\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"customerId\": \"1000\",\n" +
                "        \"relationShipToBorrower\": \"Borrower\",\n" +
                "        \"cpId\": \"12345\",\n" +
                "        \"clg\": \"CLG\",\n" +
                "        \"existingCutomer\": \"Yes\",\n" +
                "        \"entityType\": \"Business\",\n" +
                "        \"entityName\": \"Jims Florist\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"customerId\": \"9998\",\n" +
                "        \"relationShipToBorrower\": \"Director\",\n" +
                "        \"cpId\": \"12345\",\n" +
                "        \"clg\": \"CLG\",\n" +
                "        \"existingCutomer\": \"Yes\",\n" +
                "        \"entityType\": \"Individual\",\n" +
                "        \"entityName\": \"James Steven\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"customerId\": \"9999\",\n" +
                "        \"relationShipToBorrower\": \"Family\",\n" +
                "        \"cpId\": \"12345\",\n" +
                "        \"clg\": \"CLG\",\n" +
                "        \"existingCutomer\": \"Yes\",\n" +
                "        \"entityType\": \"Individual\",\n" +
                "        \"entityName\": \"James Steven's wife\"\n" +
                "        }\n" +
                "        ],\n" +
                "        \"assessmentBorrowingEntity\": {\n" +
                "        \"borrowingEntity\": \"Jims Florist\",\n" +
                "        \"anzsicCode\": 24074,\n" +
                "        \"currentConsolidatedTbl\": 48507,\n" +
                "        \"proposedConsolidatedTbl\": 100000,\n" +
                "        \"totalLendingIncrease\": 85472,\n" +
                "        \"capCustomerId\":\"1854367\"\n" +
                "        },\n" +
                "        \"customerLendingGroup\": {\n" +
                "        \"clgName\": \"Phillips, Champlin and Reynolds\",\n" +
                "        \"clgNumber\": 8506198,\n" +
                "        \"existingRG\": \"3C\",\n" +
                "        \"performanceIndicatorScore\": \"4+\",\n" +
                "        \"proposedConsolidatedTbl\": 433501,\n" +
                "        \"totalLendingIncrease\": 4265712,\n" +
                "        \"currentConsolidatedTbl\": 100000,\n" +
                "        \"otherBorrowingEntityConsolidatedTbl\": 5586649,\n" +
                "        \"sumOfInFlightApplications\": 4448418\n" +
                "        },\n" +
                "        \"inFlightApplications\": [\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 587049,\n" +
                "        \"applicationType\": \"03\",\n" +
                "        \"borrower\": \"Summer Graham\",\n" +
                "        \"proposedLimit\": 6248953\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 489959,\n" +
                "        \"applicationType\": \"01\",\n" +
                "        \"borrower\": \"Noah O'hara\",\n" +
                "        \"proposedLimit\": 5477987\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 237928,\n" +
                "        \"applicationType\": \"03\",\n" +
                "        \"borrower\": \"Anthony Howell\",\n" +
                "        \"proposedLimit\": 6206882\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 430159,\n" +
                "        \"applicationType\": \"01\",\n" +
                "        \"borrower\": \"Christopher Baumbach\",\n" +
                "        \"proposedLimit\": 5464270\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 291358,\n" +
                "        \"applicationType\": \"03\",\n" +
                "        \"borrower\": \"Willow Carroll\",\n" +
                "        \"proposedLimit\": 2826523\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 256445,\n" +
                "        \"applicationType\": \"03\",\n" +
                "        \"borrower\": \"Archie Davis MD\",\n" +
                "        \"proposedLimit\": 5234756\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 340459,\n" +
                "        \"applicationType\": \"03\",\n" +
                "        \"borrower\": \"Ivy Mills\",\n" +
                "        \"proposedLimit\": 6509815\n" +
                "        }\n" +
                "        ]\n" +
                "        },\n" +
                "        \"entity\": {\n" +
                "        \"currentTBLEntity\": 7143327,\n" +
                "        \"requestedIncreaseDecrease\": 1242969,\n" +
                "        \"proposedTBLEntity\": 2635895\n" +
                "        },\n" +
                "        \"inFlightApplications\": [\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 254858,\n" +
                "        \"applicationType\": \"01\",\n" +
                "        \"borrower\": \"Victoria Hall\",\n" +
                "        \"proposedLimit\": 7294906\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 207936,\n" +
                "        \"applicationType\": \"03\",\n" +
                "        \"borrower\": \"Miss Charlotte Harber\",\n" +
                "        \"proposedLimit\": 3996534\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 637107,\n" +
                "        \"applicationType\": \"01\",\n" +
                "        \"borrower\": \"Gemma Flatley\",\n" +
                "        \"proposedLimit\": 9918439\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 985074,\n" +
                "        \"applicationType\": \"01\",\n" +
                "        \"borrower\": \"Miss Elizabeth Goldner\",\n" +
                "        \"proposedLimit\": 7730535\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 772385,\n" +
                "        \"applicationType\": \"01\",\n" +
                "        \"borrower\": \"Lara Berge\",\n" +
                "        \"proposedLimit\": 3080275\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 819262,\n" +
                "        \"applicationType\": \"03\",\n" +
                "        \"borrower\": \"Eliza Kelly\",\n" +
                "        \"proposedLimit\": 7548108\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 852834,\n" +
                "        \"applicationType\": \"02\",\n" +
                "        \"borrower\": \"Elizabeth Price\",\n" +
                "        \"proposedLimit\": 4928194\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 549530,\n" +
                "        \"applicationType\": \"01\",\n" +
                "        \"borrower\": \"Abby Reynolds Jr.\",\n" +
                "        \"proposedLimit\": 2033516\n" +
                "        },\n" +
                "        {\n" +
                "        \"inFlightApplicationId\": 340089,\n" +
                "        \"applicationType\": \"01\",\n" +
                "        \"borrower\": \"Alana O'hara\",\n" +
                "        \"proposedLimit\": 3232610\n" +
                "        }\n" +
                "        ],\n" +
                "        \"submissionHistory\": [\n" +
                "        {\n" +
                "        \"version\": 11,\n" +
                "        \"decisionStatus\": \"Denied\",\n" +
                "        \"decisionDate\": \"12/11/2015\",\n" +
                "        \"lender\": \"Lily Corkery I\",\n" +
                "        \"accountStatus\": \"Accredited\",\n" +
                "        \"contact\": \"0494 062 563\",\n" +
                "        \"assessor\": \"Zac Berge\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"version\": 11,\n" +
                "        \"decisionStatus\": \"Denied\",\n" +
                "        \"decisionDate\": \"12/11/2015\",\n" +
                "        \"lender\": \"Matthew Jackson\",\n" +
                "        \"accountStatus\": \"Accredited\",\n" +
                "        \"contact\": \"06 3639 8262\",\n" +
                "        \"assessor\": \"Leah Bosco\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"version\": 11,\n" +
                "        \"decisionStatus\": \"Approved\",\n" +
                "        \"decisionDate\": \"12/11/2015\",\n" +
                "        \"lender\": \"Gabriel Fadel\",\n" +
                "        \"accountStatus\": \"Accredited\",\n" +
                "        \"contact\": \"+61 2 0974 2607\",\n" +
                "        \"assessor\": \"Layla Griffiths DDS\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"version\": 11,\n" +
                "        \"decisionStatus\": \"Approved\",\n" +
                "        \"decisionDate\": \"12/11/2015\",\n" +
                "        \"lender\": \"Zachary Murphy\",\n" +
                "        \"accountStatus\": \"Accredited\",\n" +
                "        \"contact\": \"07 4926 3010\",\n" +
                "        \"assessor\": \"Archie Marvin\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"version\": 11,\n" +
                "        \"decisionStatus\": \"Approved\",\n" +
                "        \"decisionDate\": \"12/11/2015\",\n" +
                "        \"lender\": \"Jack Kiehn\",\n" +
                "        \"accountStatus\": \"Accredited\",\n" +
                "        \"contact\": \"0476 783 159\",\n" +
                "        \"assessor\": \"Elizabeth Wolf\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"version\": 11,\n" +
                "        \"decisionStatus\": \"Approved\",\n" +
                "        \"decisionDate\": \"12/11/2015\",\n" +
                "        \"lender\": \"Sienna Mills\",\n" +
                "        \"accountStatus\": \"Accredited\",\n" +
                "        \"contact\": \"0498 522 885\",\n" +
                "        \"assessor\": \"Hugo Lakin Sr.\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"version\": 11,\n" +
                "        \"decisionStatus\": \"Denied\",\n" +
                "        \"decisionDate\": \"12/11/2015\",\n" +
                "        \"lender\": \"Declan Moore\",\n" +
                "        \"accountStatus\": \"Accredited\",\n" +
                "        \"contact\": \"+61 5 7197 8664\",\n" +
                "        \"assessor\": \"Kayla Hamilton Jr.\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"version\": 11,\n" +
                "        \"decisionStatus\": \"Denied\",\n" +
                "        \"decisionDate\": \"12/11/2015\",\n" +
                "        \"lender\": \"Cooper Kuhn\",\n" +
                "        \"accountStatus\": \"Accredited\",\n" +
                "        \"contact\": \"+61 6 8742 2278\",\n" +
                "        \"assessor\": \"Tyler Towne\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"version\": 11,\n" +
                "        \"decisionStatus\": \"Approved\",\n" +
                "        \"decisionDate\": \"12/11/2015\",\n" +
                "        \"lender\": \"Mr. Matilda Morgan\",\n" +
                "        \"accountStatus\": \"Accredited\",\n" +
                "        \"contact\": \"0485 810 881\",\n" +
                "        \"assessor\": \"Mr. Finn Dickens\"\n" +
                "        }\n" +
                "        ],\n" +
                "        \"submitterNotes\": [\n" +
                "        {\n" +
                "        \"date\": \"2015-11-06T22:09:11.736Z\",\n" +
                "        \"submitter\": \"Mikayla Young\",\n" +
                "        \"notes\": \"Test Notes from submitter\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"date\": \"2015-10-20T10:10:24.515Z\",\n" +
                "        \"submitter\": \"Lara Evans\",\n" +
                "        \"notes\": \"Test Notes from submitter\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"date\": \"2015-10-17T10:08:59.218Z\",\n" +
                "        \"submitter\": \"Caleb Reilly DDS\",\n" +
                "        \"notes\": \"Test Notes from submitter\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"date\": \"2016-06-01T03:07:46.342Z\",\n" +
                "        \"submitter\": \"Ali Walker\",\n" +
                "        \"notes\": \"Test Notes from submitter\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"date\": \"2015-07-03T00:18:42.799Z\",\n" +
                "        \"submitter\": \"Amelie Jacobson MD\",\n" +
                "        \"notes\": \"Test Notes from submitter\"\n" +
                "        },\n" +
                "        {\n" +
                "        \"date\": \"2016-01-31T23:31:08.503Z\",\n" +
                "        \"submitter\": \"Phoebe Mueller\",\n" +
                "        \"notes\": \"Test Notes from submitter\"\n" +
                "        }\n" +
                "        ],\n" +
                "        \"decisionResult\": \"Approved\",\n" +
                "        \"decisionDateTime\": \"07/08/2014 - 11:14am AEST\",\n" +
                "        \"collateral\": {\n" +
                "        \"assessedSecurityValues\": {\n" +
                "        \"proposedSecurityAmount\": 2128,\n" +
                "        \"proposedTblForSi\": 169,\n" +
                "        \"securitiesCrossCollateralised\": \"true\",\n" +
                "        \"securityCover\": 472,\n" +
                "        \"minSecurityCover\": 39483,\n" +
                "        \"netAssetRatio\": 371\n" +
                "        }\n" +
                "        },\n" +
                "        \"customerId\": 85718871,\n" +
                "        \"applicationId\": 8274341,\n" +
                "        \"transactId\": 8274341\n" +
                "        }";


        httpExchange.sendResponseHeaders(200, msg.length());
        Headers responseHeaders = httpExchange.getResponseHeaders();
        responseHeaders.set("Content-Type", "application/vnd.csp-anz.com+json;version=1.0;charset=UTF-8");
        OutputStream os = httpExchange.getResponseBody();
        os.write(msg.getBytes());
        os.close();
    }
}

