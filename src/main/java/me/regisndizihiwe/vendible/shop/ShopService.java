package me.regisndizihiwe.vendible.shop;

import me.regisndizihiwe.vendible.VendibleApplication;
import me.regisndizihiwe.vendible.interfaces.Location;
import me.regisndizihiwe.vendible.interfaces.VendibleResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Component
public class ShopService {
    public VendibleResponse<List<Shop>> getAllShops() {
        List<Shop> allShops = List.of(
                new Shop("ABC Shop",
                        new Location(
                                -2.081383,
                                30.685868,
                                "Muhoza",
                                "Musanze",
                                "Rusagara",
                                "Mpenge"),
                        "abcshop@gmail.com",
                        "MUKEZA Davina",
                        "mukezad@gmail.com",
                        "pass@word",
                        false,
                        LocalDate.of(2024, 12, 16)
                ));

        return new VendibleResponse<List<Shop>>(
                HttpStatus.OK,
                "Students list generated",
                true,
                allShops
        );


    }
}
