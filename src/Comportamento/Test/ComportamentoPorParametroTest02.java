package Comportamento.Test;
import Comportamento.Domain.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class ComportamentoPorParametroTest02 {
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
    private static <T> List<T> filter (List<T> list, Predicate<T> predicate){
        List <T> filteredList = new ArrayList<>();
        for (T t : list){
            if (predicate.test(t)){
                filteredList.add(t);
            }
        }
        return filteredList;
    }
}
