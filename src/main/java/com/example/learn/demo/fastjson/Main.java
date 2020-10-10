package com.example.learn.demo.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: guojun
 * @Date: 2019/11/12
 */
public class Main {

    public static void main(String[] args) {
        String s = "{\"sex\":\"男\",\"name\":\"张三\",\"weight\":120,\"age\":12,\"height\":175}";
        User user = JSON.parseObject(s, User.class);
        System.out.println(user);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class User {

        private Integer age;

        private String name;

        private Integer height;
    }
}
