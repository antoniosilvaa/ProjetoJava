package Lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdasTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Antonio", "ivan", "gondim");
        List<Integer> integers = List.of(1,2,3,4,5);
        forEach(strings, (String string) -> System.out.println(string));
        System.out.println(forEachNums(integers, integer -> integer % 2 == 0));


    }

    private static <T> void  forEach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }
    }

    private static <T> List<T> forEachNums(List<T> list, Predicate<T> predicate) {
        List<T> filter = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)){
                filter.add(e);
            }
        }
        return filter;
    }
}
