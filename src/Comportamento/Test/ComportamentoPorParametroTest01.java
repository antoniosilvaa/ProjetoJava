package Comportamento.Test;

import Comportamento.Domain.Car;
import Comportamento.Interface.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private  static     List<Car> cars = List.of(new Car("green" , 2011),
            new Car("Black", 1988),
            new Car("Blue", 2019)
    );

    public static void main(String[] args) {


        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> yearsBeforeCars = filter(cars, car -> car.getYear() < 2019);

        System.out.println(greenCars);
        System.out.println(yearsBeforeCars);

    }

    private static  List<Car>filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filter = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.teste(car)){
                filter.add(car);
            }
        }
        return filter;
    }


}
