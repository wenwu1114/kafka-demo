package com.example.kafkademo.pojo;

import com.google.gson.Gson;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {
    private Long id;
    private String name;
    private Integer age;

    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
