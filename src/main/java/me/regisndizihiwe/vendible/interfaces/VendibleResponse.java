package me.regisndizihiwe.vendible.interfaces;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.http.HttpStatus;

@JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
public class VendibleResponse<T> {
    private HttpStatus status ;
    private String  message ;
    private  boolean success;
    private  T data;

    public VendibleResponse(HttpStatus status, String message, boolean success, T data) {
        this.status = status;
        this.message = message;
        this.success = success;
        this.data = data;
    }
}
