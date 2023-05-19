package com.hi.board.controller;

import com.hi.board.domain.RequestModifyRequest;
import com.hi.board.service.BoardModifyService;
import com.hi.board.service.BoardReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@Controller
@RequestMapping("/board/modify")
public class BoardModifyController {

    @Autowired
    private BoardModifyService modifyService;

    @Autowired
    private BoardReadService readService;

    @GetMapping
    public void modifyForm(
            Model model,
            HttpServletRequest request,
            @RequestParam("bno") int bno
    ){

        model.addAttribute("board" , readService.getBoardDTO(bno));
    }

    @PostMapping
    public String modify(

            RequestModifyRequest modifyRequest,
            HttpServletRequest request

    ){

        log.info(modifyRequest);

        modifyService.modifyBoardDTO(modifyRequest , request);

        return "redirect: /board/list";

    }


}