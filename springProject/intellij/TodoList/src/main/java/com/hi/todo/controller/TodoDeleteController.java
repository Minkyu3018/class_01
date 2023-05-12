package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class TodoDeleteController {

    // 삭제번호 받고 -> 삭제 -> /todo/list

    @RequestMapping("/todo/delete")  // delete라고 들어오면 하위 응답
    public String deleteTodo(
            @RequestParam("tno") int tno

    ){
        log.info("  /todo/delete");

        log.info("삭제 요청번호 : " + tno);

        return "redirect:/todo/list";   // view가 아니고 등록했던 URL
    }
}
