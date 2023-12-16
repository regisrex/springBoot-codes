package me.regisndizihiwe.vendible.utils;

public class LocationValidator {
    public static boolean validateLocation(double latitude, double longitude){
        return latitude > 0 && latitude < 3 && longitude > 0 && longitude < 120 ;
    }

    public LocationValidator() {
    }
}
