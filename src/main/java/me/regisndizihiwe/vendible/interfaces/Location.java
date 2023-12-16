package me.regisndizihiwe.vendible.interfaces;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Location {


    double latitude;
    double longitude;

    String sector;
    String district;
    String village;
    String cell;

    public Location(double latitude, double longitude, String sector, String district, String village, String cell) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.sector = sector;
        this.district = district;
        this.village = village;
        this.cell = cell;
    }
}
