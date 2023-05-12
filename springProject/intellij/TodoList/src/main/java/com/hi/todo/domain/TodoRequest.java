package com.hi.todo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Beans 형식의 어노테이션
@NoArgsConstructor // default 생성자 만들어주는 어노테이션
@Getter
@Setter
@ToString
public class TodoRequest {

    // 파라미터값을 받아서 저장할 변수를 정의
    // 변수의 이름은 파라미터의 이름과 같이 정의
    // Java Beans 형식 (getter, setter)

    private String todo;
    private String duedate;

}
