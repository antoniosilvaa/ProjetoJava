package Colecoes.test;

import Colecoes.domain.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmatphoneListTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1ABC1", "iphone");
        SmartPhone s2 = new SmartPhone("1233", "nokia");
        SmartPhone s3 = new SmartPhone("213321", "Samsung");


        List<SmartPhone> smartPhonesList = new ArrayList<>();

        smartPhonesList.add(s1);
        smartPhonesList.add(s2);
        smartPhonesList.add(s3);

        for (SmartPhone smartPhone : smartPhonesList){
            System.out.println(smartPhone);
        }
        System.out.println("---------");

        SmartPhone s4 = new SmartPhone("213341", "Samsung");
        smartPhonesList.add(s4);

        System.out.println(smartPhonesList.contains(s4));

        int indexSmartphone4 = smartPhonesList.indexOf(s4);

        System.out.println(smartPhonesList.get(indexSmartphone4));


    }
}
