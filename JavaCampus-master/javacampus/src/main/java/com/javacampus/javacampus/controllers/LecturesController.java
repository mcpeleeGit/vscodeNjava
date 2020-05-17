
package com.javacampus.javacampus.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LecturesController {
    @RequestMapping(value = "/lectures")
    public String index() {
        return "강좌 리스트 Lectures";
    }    
}
