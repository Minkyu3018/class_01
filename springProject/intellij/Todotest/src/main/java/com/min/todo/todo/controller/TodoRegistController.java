package com.min.todo.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/todo/regist")
public class TodoRegistController {

    // get : form 페이지로 응답처리
    @RequestMapping(method = RequestMethod.GET)
    public String getRegistForm(){

        log.info("GET  / todo/regist");
        return "todo/registForm";
    }

    // post : redirect -> /todo/list , view 필요가 없다.
    @RequestMapping(method = RequestMethod.POST)
    public String regist(){
        log.info("post   /todo/regist");
        return "redirect:/todo/list";
    }


}
