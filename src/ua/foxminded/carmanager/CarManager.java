package ua.foxminded.carmanager;

import ua.foxminded.carmanager.gavno.CarColour;

import static ua.foxminded.carmanager.gavno.CarColour.YELLOW;

public class CarManager {
    public static void main(String[] args) {

        Car toyota = new Car( "Prius" , 2007, 7000, 1800, "Green");

        Car renault = new Car("Lagoona" , 2011, 15000, 1600, "white");

        MotorCycle yamaha = new MotorCycle( "FZ1",  2007,  9000, 700, YELLOW, "Gas", false);

        MotorCycle suzuki = new MotorCycle("GSX-R1000", 2021, 16000, 600, "Black","Diesel",true);
        System.out.println(toyota);
        System.out.println(renault);
        System.out.println(yamaha);
        System.out.println(suzuki);

    }
}
