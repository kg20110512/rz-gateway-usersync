package com.gateway.rz.usersync.entity;

import org.springframework.http.ResponseEntity;

public class MyResponeEntity<T> {

    String retcode;
    String message;
    ResponseEntity<T> responseEntity;

    final static String RETCODE_SUCCESS = "200";
    final static String MESSAGE_SUCCESS = "success";
    final static String RETCODE_FAIL = "500";
    final static String MESSAGE_FAIL = "fail";

    public MyResponeEntity() {
    }

    public MyResponeEntity(String retcode, String message, ResponseEntity<T> responseEntity) {
        this.retcode = retcode;
        this.message = message;
        this.responseEntity = responseEntity;
    }

    public static MyResponeEntity build(){
        return new MyResponeEntity();
    }

    public MyResponeEntity retcode(String retcode){
        this.retcode = retcode;
        return this;
    }

    public MyResponeEntity message(String message){
        this.message = message;
        return this;
    }

    public MyResponeEntity responeEntity(ResponseEntity<T> responseEntity){
        this.responseEntity = responseEntity;
        return this;
    }


}
