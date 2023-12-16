package me.regisndizihiwe.vendible.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.regisndizihiwe.vendible.interfaces.Location;

import java.time.LocalDate;


public class Shop {
    @Getter
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Location location;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String ownerName;

    @Getter
    @Setter
    private String ownerEmail;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private boolean isPromoted;

    @Getter
    @Setter
    private LocalDate promotionEndDate;

    public Shop(String name, Location location, String email, String ownerName, String ownerEmail, String password, boolean isPromoted, LocalDate promotionEndDate) {
        this.name = name;
        this.location = location;
        this.email = email;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.password = password;
        this.isPromoted = isPromoted;
        this.promotionEndDate = promotionEndDate;
    }

}
