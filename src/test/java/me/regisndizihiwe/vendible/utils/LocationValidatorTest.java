package me.regisndizihiwe.vendible.utils;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class LocationValidatorTest {

    @Test
    void givenLatAndLongitude_whenValid_returnsTrue(){
        boolean actual  = LocationValidator.validateLocation(2,14);
        boolean expected  = true;
        Assert.assertEquals(actual,expected);
    }
}
