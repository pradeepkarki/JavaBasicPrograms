package com.java.dkprojects.api;


import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class DemoProject_API extends BaseAPIClient {

    /**
     * demo api site : http://dummy.restapiexample.com/
     */

    final String baseURL = "http://dummy.restapiexample.com/api/v1";
    final String getAllEmployeeData = "/employees";
    final String getSingleEmployeeData = "/employee/{id}";
    final String createNewEmployeeRecord = "/create";
    final String updateEmployeeRecord = "/update/{id}";
    final String deleteEmployeeRecord = "/delete/{id}";

//    @Test
    public void getAllEmployeeData() throws JSONException {
        Response res = getMethod(baseURL, getAllEmployeeData);
        System.out.println(res.statusCode());
        String responseString = res.getBody().asString();
        System.out.println(responseString);
        /*
        print the salary of "Garrett Winters"
         */
        JSONObject jsonObj = new JSONObject(responseString);
        JSONArray jsonArray = jsonObj.getJSONArray("data");
        for (int i = 0; i < jsonArray.length(); i++) {
            if (jsonArray.getJSONObject(i).get("employee_name").equals("Garrett Winters")) {
                System.out.println("Garrett Winters's salary is : " + jsonArray.getJSONObject(i).get("employee_salary").toString());
                break;
            }
        }
    }

    //    @Test
    public void getSingleEmployeeData() {
        Response res = getMethodWithPathParam(baseURL, getSingleEmployeeData, "id", "1");
        System.out.println(res.statusCode());
        String responseString = res.getBody().asString();
        System.out.println(responseString);
    }

    //    @Test
    public void createNewEmployeeRecord() {
        String reqBody = Helper_API.readAndGetPayloadTemplate("createEmployeeRecord.json");
        Response res = postMethod(baseURL, createNewEmployeeRecord, reqBody);
        System.out.println(res.statusCode());
        String responseString = res.getBody().asString();
        System.out.println(responseString);
    }

    //@Test
    public void updateEmployeeRecord() {
        String reqBody = Helper_API.readAndGetPayloadTemplate("updateEmployeeRecord.json");
        Response res = putMethod(baseURL, updateEmployeeRecord, reqBody, "id", "21");
        System.out.println(res.statusCode());
        String responseString = res.getBody().asString();
        System.out.println(responseString);
    }

    //@Test
    public void DeleteEmployeeRecord(){
        Response res = deleteMethod(baseURL,deleteEmployeeRecord,"id","22");
        System.out.println(res.statusCode());
        String responseString = res.getBody().asString();
        System.out.println(responseString);
    }

}
