package tmp.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Malikov on 4/21/2017.
 */
public class Runner {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList(Arrays.asList(
                new Car(0, "BMW", "X5", 2010, "red", 35000, "AA1232BC"),
                new Car(0, "BMW", "X5", 2005, "blue", 33000, "BB1232BC"),
                new Car(0, "BMW", "X6", 2004, "yellow", 31000, "DD1232BC"),
                new Car(0, "BMW", "X6", 2009, "black", 36000, "NN1232BC"),
                new Car(0, "BMW", "X6", 2010, "brown", 75000, "MMAA1232BC"),
                new Car(0, "Honda", "Civic", 2010, "purple", 95000, "XXAA1232BC")
        ));

        System.out.println("All BMW : " + CarUtil.getCarsByBrand(cars, "BMW"));
        System.out.println("\nAll X6  older 2008: " + CarUtil.getCarsByBrandOlderThan(cars,"X6", 2008));
        System.out.println("\nAll BMW of 2010 year and price bigger than 50 000: " + CarUtil.getCarsByYearPriceBiggerThan(cars,2010, 50000));
    }

}
