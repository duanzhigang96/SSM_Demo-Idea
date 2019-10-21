package com.example.javaTest;

import org.junit.jupiter.api.Test;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class forEachMap {

    @Test
    public void setCookie() {
        Map<String, Object> cookieMap = new HashMap<>();
        StringBuffer cookieValue = new StringBuffer();
        cookieMap.put("username", "admin");
        cookieMap.put("password", "123456");

        for (Object key : cookieMap.keySet()) {
            cookieValue.append(key.toString() + "=" + cookieMap.get(key).toString() + ";");
        }
        System.out.println(cookieValue);
    }


}
