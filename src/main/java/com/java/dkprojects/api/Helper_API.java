package com.java.dkprojects.api;


import com.google.common.io.Resources;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Helper_API {

    public static String readAndGetPayloadTemplate(String fileName) {
        URL url = Resources.getResource("payloadTemplate" + File.separator + fileName);
        String templateContent = null;
        try {
            templateContent = Resources.toString(url, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("failed to load payload template : " + fileName);
        }
        return templateContent;
    }
}
