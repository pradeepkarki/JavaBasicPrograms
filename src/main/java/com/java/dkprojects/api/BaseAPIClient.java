package com.java.dkprojects.api;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseAPIClient {

    private static final int SUCCESSFUL_RESPONSE_CODE = 200;

    public Response getMethod(String baseUrl, String endpoint) {
        String url = baseUrl + endpoint;
        RequestSpecification req = given().contentType("application/json");
        Response res = req.get(url);
        return res;
    }

    public Response getMethodWithPathParam(String baseUrl, String endpoint, String paramKey, String paramValue) {
        String url = baseUrl + endpoint;
        RequestSpecification req = given()
                .contentType("application/json")
                .pathParam(paramKey, paramValue);
        Response res = req.get(url);
        return res;
    }

    public Response postMethod(String baseUrl, String endpoint, String requestBody) {
        String url = baseUrl + endpoint;
        RequestSpecification req = given().contentType("application/json").body(requestBody);
        Response res = req.post(url);
        return res;
    }

    public Response putMethod(String baseUrl, String endpoint, String requestBody, String paramKey, String paramValue) {
        String url = baseUrl + endpoint;
        RequestSpecification req = given().contentType("application/json").body(requestBody).pathParam(paramKey, paramValue);
        Response res = req.put(url);
        return res;
    }

    public Response deleteMethod(String baseUrl, String endpoint, String paramKey, String paramValue) {
        String url = baseUrl + endpoint;
        RequestSpecification req = given().contentType("application/json").pathParam(paramKey, paramValue);
        Response res = req.delete(url);
        return res;
    }

    public Response test(String baseUrl, String endpoint, String paramKey, String paramValue) {
        String url = baseUrl + endpoint;
        RequestSpecification req = given().contentType("application/json").pathParam(paramKey, paramValue);
        Response res = req.delete(url);
        return res;
    }

    /**
     * Check Response Code for Success
     *
     * @param url
     * @param response
     */
    private void checkResponseCode(String url, Response response) {
        if (!(response.getStatusCode() == SUCCESSFUL_RESPONSE_CODE)) {
            throw new RuntimeException(" API CALL FAILED " + url + " Status Code: " + response.getStatusCode() + "\nResponse Headers: " + response.getHeaders().asList());
        }
    }
}
