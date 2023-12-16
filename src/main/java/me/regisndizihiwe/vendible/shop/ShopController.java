package me.regisndizihiwe.vendible.shop;


import me.regisndizihiwe.vendible.interfaces.VendibleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/shops")
public class ShopController {

    private  final ShopService shopService ;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }


    @GetMapping
    public VendibleResponse<List<Shop>> getAllShops(){
        return shopService.getAllShops();
    }

}
