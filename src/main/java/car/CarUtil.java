package car;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Malikov on 4/21/2017.
 */
public class CarUtil {
    public static List<Car> getCarsByBrand(List<Car> cars, String brand) {
        return cars.stream().filter(car -> car.getBrand().equals(brand)).collect(Collectors.toList());
    }

    public static List<Car> getCarsByBrandOlderThan(List<Car> cars, String model, int year) {
        return cars.stream().filter(car -> (car.getModel().equals(model) && car.getYear() > year)).collect(Collectors.toList());
    }

    public static List<Car> getCarsByYearPriceBiggerThan(List<Car> cars, int year, double price) {
        return cars.stream().filter(car -> (car.getPrice() > price && car.getYear() == year)).collect(Collectors.toList());
    }
}
