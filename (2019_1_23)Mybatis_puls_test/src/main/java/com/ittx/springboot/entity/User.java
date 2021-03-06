package com.ittx.springboot.entity;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User{
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @Version
    private Integer version;
    public User(Long id, String name, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
