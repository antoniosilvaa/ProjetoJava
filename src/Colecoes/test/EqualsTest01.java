package Colecoes.test;

import Colecoes.domain.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("1ABC1", "iphone");
        SmartPhone smartPhone2 = new SmartPhone("1ABC1", "nokia");

        System.out.println(smartPhone.equals(smartPhone2));
    }
}
