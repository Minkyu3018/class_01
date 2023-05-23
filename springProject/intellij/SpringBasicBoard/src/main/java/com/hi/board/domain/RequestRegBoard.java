package com.hi.board.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class RequestRegBoard {

    private String title;
    private String content;

    // private String writer;
    // 회원제 게시판 작성자는 memidx로 변경 (23.5.23)
    private int memidx;


    // 파일 업로드를 위해서 변수가 추가됨
    private MultipartFile file; // 사용자로부터 받는 파일 객체
    // 이름 저장 중복 피하기 위해 --> 난수 + 원래이름 => 새로운이름 => filename
    private String filename; // DB에 저장할 File이름
}
