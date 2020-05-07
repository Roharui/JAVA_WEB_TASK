package kr.hs.dgsw.webclass1;

import lombok.Data;

@Data    // getter setter 메소드를 활성화 시켜주는 어노테이션
public class User {
    private String id;
    private String name;
    private String email;

    //생성자
    public User() {}

    //입력 생성자
    public User(String id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}