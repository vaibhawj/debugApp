package com.filter.debugApp.controller;

import com.filter.debugApp.controller.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonController {

    @GetMapping("/persons/{id}")
    @ResponseBody
    public Person get(@PathVariable("id") String id){
        return new Person(id, "Sam");
    }
}
