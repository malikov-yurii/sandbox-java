package car;

/**
 * Created by Malikov on 4/21/2017.
 */
public class Car {
    private int id;

    private String brand;

    private String model;

    private int year;

    private String color;

    private double price;

    private String idNumber;

    public Car(int id, String brand, String model, int year, String color, double price, String idNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.idNumber = idNumber;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "\nMotorcycle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}

