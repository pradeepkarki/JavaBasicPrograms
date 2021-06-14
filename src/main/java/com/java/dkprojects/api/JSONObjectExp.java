package com.java.dkprojects.api;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONObjectExp {

    public static void main(String[] args) throws JSONException {
        arrayToJsonObject();
        stringtoJsonObject();
    }

    private static void stringtoJsonObject() throws JSONException {
        String str="{\"name\":\"pradeep\"}";
        JSONObject obj = new JSONObject(str);
        System.out.println("*******************************");
        System.out.println(obj.getString("name"));

    }

    private static void arrayToJsonObject() throws JSONException {
        String json = "[{\"name\":\"pradeep\"},{\"name\":\"pradeep2\"}]";

        JSONArray array = new JSONArray(json);

        for(int i=0;i<=array.length()-1;i++)
        {
            JSONObject obj = array.getJSONObject(i);
            String str = obj.getString("name");
            System.out.println(str);
        }
    }

}
