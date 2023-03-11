package aula10;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        Map<String,ArrayList<String>> map = new TreeMap<>();

        map.put("Branco", new ArrayList<>());
        map.get("Branco").add("Que tem a cor da neve");
        map.get("Branco").add("Que tem a cor do meu pc");
        map.put("Azul", new ArrayList<>());
        map.get("Azul").add("Que tem a cor do mar");
        map.get("Azul").add("Que tem a cor do céu");
        map.put("Vermelho", new ArrayList<>());
        map.get("Vermelho").add("Que tem a cor do sangue");
        map.get("Vermelho").add("Que tem a cor do Estádio da Luz");
        

        Scanner sc=new Scanner(System.in);
        System.out.println("Insira um termo:");
        String str=sc.nextLine();
        sc.close();

        int i = map.get(str).size();

        Random rand = new Random();
        int maxNumber = i;
        int randomNumber = rand.nextInt(maxNumber) ;

        System.out.println(map.get(str).get(randomNumber));
    }
}

