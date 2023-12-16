package me.regisndizihiwe.vendible.utils;

import me.regisndizihiwe.vendible.interfaces.Location;
import me.regisndizihiwe.vendible.shop.Shop;
import me.regisndizihiwe.vendible.shop.ShopRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testng.Assert;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class ShopRepositoryMock {

    @Mock
    ShopRepository shopRepositoryMock = mock(ShopRepository.class);

    @Test
    void save_createdShop(){
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

        when(shopRepositoryMock.findAll()).thenReturn(allShops);

        Assert.assertEquals(allShops, shopRepositoryMock.findAll());
    }
}
