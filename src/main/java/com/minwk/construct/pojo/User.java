package com.minwk.construct.pojo;

import java.io.Serializable;

/**
 * @author MinWeikai
 * @date 2021/10/26 15:20
 */
public class User implements Serializable {

    private String name;

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
