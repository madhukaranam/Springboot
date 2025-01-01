package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/libary/book")
public class LibraryController {

    @GetMapping("/count")
    public int getNumberOfBooks(){
        return 100;
    }
}
