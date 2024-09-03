package com.example.jpaobligatorisk.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UnicodeRestController {
    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {

        char c = (char) i;

        return "unicode=" + i + " char=" + c;
    }



    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c) {

        int i = c;

        return "char=" + c + " unicode=" + i;
    }

    @GetMapping("/printing/{c}/{j}")
    public List<Character> printing(@PathVariable char c, @PathVariable int j) {
        List<Character> lst = new ArrayList<>();
        for (int i = 0; i < j; i++) {

            lst.add(c);
            System.out.println(c);

        }
     return lst;

        }

}
