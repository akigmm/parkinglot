package com.ayush.parkinglot;

/**
 * Created by Ayush on 01/07/2019.
 */
public class ParkingLotFactory {

    public static IParkingLot createParkingLot()
    {
        return new ParkingLotImpl();
    }
}
