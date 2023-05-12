package com.min.todo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class TodoRequest {

    // 파라미터값을 받아서 저장할 변수를 정의한다
    // 변수의 이름은 파라미터의 이름과 같이 정의한다
    // Java Beans 형식으로... (getter,setter)

    private String todo;
    private String duedate;

}
