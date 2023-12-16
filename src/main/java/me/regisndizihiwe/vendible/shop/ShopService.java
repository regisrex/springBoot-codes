package me.regisndizihiwe.vendible.shop;

import me.regisndizihiwe.vendible.VendibleApplication;
import me.regisndizihiwe.vendible.interfaces.Location;
import me.regisndizihiwe.vendible.interfaces.VendibleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Component
public class ShopService {


    @Autowired
    private  final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }


    public VendibleResponse<List<Shop>> getAllShops() {
        List<Shop> allShops = shopRepository.findAll();

        return new VendibleResponse<List<Shop>>(
                HttpStatus.OK,
                "Students list generated",
                true,
                allShops
        );
    }

    public  VendibleResponse<Shop> createShop(Shop shop){
        Shop shop1 =  shopRepository.save(shop);
        return new VendibleResponse<Shop>(
                HttpStatus.CREATED,
                "Shop created",
                true,
                shop1
        );
    }
}
