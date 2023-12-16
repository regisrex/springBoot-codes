package me.regisndizihiwe.vendible.interfaces;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.regisndizihiwe.vendible.shop.Shop;

import java.io.Serializable;


@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    double latitude;
    double longitude;

    String sector;
    String district;
    String village;
    String cell;

    @OneToOne
    private Shop shop;

    public Location(double latitude, double longitude, String sector, String district, String village, String cell) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.sector = sector;
        this.district = district;
        this.village = village;
        this.cell = cell;
    }

    public Location() {

    }
}
