package Colecoes.test;

import Colecoes.domain.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
class SmartphoneMarcaComparator implements Comparator<SmartPhone>{

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        SmartPhone smartPhone = new SmartPhone("123", "Nokia");
        set.add(smartPhone);
        System.out.println(set);
    }
}
