package me.regisndizihiwe.vendible.shop;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.regisndizihiwe.vendible.interfaces.Location;

import java.time.LocalDate;


@Getter
@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy =  GenerationType.UUID)
    private String id;

    @Setter
    private String name;

    @Setter
    @OneToOne
    private Location location;

    @Setter
    private String email;

    @Setter
    private String ownerName;

    @Setter
    private String ownerEmail;

    @Setter
    private String password;

    @Setter
    private boolean isPromoted;

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

    public Shop() {

    }
}
