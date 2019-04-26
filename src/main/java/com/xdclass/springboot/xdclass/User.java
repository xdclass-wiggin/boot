package com.xdclass.springboot.xdclass;

import io.swagger.annotations.ApiParam;
import lombok.*;
@Value
public class User {

    @ApiParam(value = "name",defaultValue = "")
    private String name;
    @ApiParam(value = "name",defaultValue = "")
    private String sex;
    @ApiParam(value = "name",defaultValue = "")
    private String birth;
    @ApiParam(value = "name",defaultValue = "")
    private String nickname;
    @ApiParam(value = "name",defaultValue = "")
    private String age;


    public static void main(String[] args) {
        String data = "{\n" +
                "  \"userName\":\"xdclass\",\n" +
                "  \"sex\":\"male\",\n" +
                "  \"birth\":\"1991-11-11\"\n" +
                "}\n";

        String msg = "";
    }
}
