package Colecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("Teklado", "Teclado");
        map.put("mouze", "mouse");
        map.put("vc", "Você");

        System.out.println(map);

        for (String keySet : map.keySet()){
            System.out.println(keySet +" : " + map.get(keySet));
        }
    }
}
