package aula10;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Branco", "Que tem a cor do Nevada");
        map.put("Azul", "Que tem a cor do mar");
        map.put("Vermelho", "Que tem a cor do sangue");
        map.remove("Azul");
        map.replace("Branco", "Que tem a cor do Nevada", "Que tem a cor da neve");

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
