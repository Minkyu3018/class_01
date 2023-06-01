package org.zerock.b2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/todo/")
@Log4j2
public class TodoController {

    @GetMapping("list")
    public void list(){
        log.info("list.......");

    }
    
    @GetMapping("add")
    public void add(){
        log.info("Add.......");

    }

    @GetMapping("read/{tno}")
    public String read(@PathVariable("tno") Long tno ){
        log.info("Add.......");
        return "/todo/read";
        

    }
}
