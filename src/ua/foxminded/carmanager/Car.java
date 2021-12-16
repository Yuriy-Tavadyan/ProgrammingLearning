package ua.foxminded.carmanager;

public class Car {
    static String name = "gavno";
    int yearOfProduction;
    int price;
    float weight;
    String colour;

    public Car(String name, int yearOfProduction, int price, float weight, String colour) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.colour = colour;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }
}
