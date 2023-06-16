package com.example.demo.utils;

public class Response {
    public String message;
    public  boolean success;

    public  Number status;

    public Object data;

    public Response(String message, boolean success, Number status, Object data) {
        this.message = message;
        this.success = success;
        this.status = status;
        this.data = data;
    }
}
