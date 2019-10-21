package com.example.controller;

import com.example.javaTest.absClass;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "Hello Worlds!";
    }

    public static void main(String[] args) {

        new absClass() {
            @Override
            public void onStart() {
                super.onStart();
            }

            @Override
            public void onSuccess() {
                System.out.println("success");
            }

            @Override
            public void onFailure() {
                super.onFailure();
            }
        };
    }
}
