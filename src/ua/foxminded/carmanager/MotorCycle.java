package ua.foxminded.carmanager;

import ua.foxminded.carmanager.gavno.CarColour;

public class MotorCycle {
    String name;
    int yearOfProduction;
    int price;
    float weight;
    String colour;
    String motorType;
    boolean isReadyToGo;

    public MotorCycle(String name, int yearOfProduction, int price, float weight, CarColour colour, String motorType, boolean isReadyToGo) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.colour = colour;
        this.motorType = motorType;
        this.isReadyToGo = isReadyToGo;
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                ", motorType='" + motorType + '\'' +
                ", isReadyToGo=" + isReadyToGo +
                '}';
    }
}
