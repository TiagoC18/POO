package aula09;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import aula06.Data;
import aula06.Pessoa;
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> c1= new ArrayList<>();
        for(int i= 10; i<= 100; i+=10) c1.add(i);
        System.out.println("Size: "+ c1.size());
        for(int i= 0; i< c1.size(); i++) System.out.println("Elemento: "+ c1.get(i));
        
        ArrayList<String> c2= new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);
        c2.add(1, "Nublado");
        System.out.println(c2);
        c2.set(2, "Granizo");
        System.out.println(c2);
        System.out.println(c2.contains("Granizo"));
        System.out.println(c2.indexOf("Chuva"));
        System.out.println(c2.lastIndexOf("Nublado"));
        System.out.println(c2.subList(0, 1));

        Set<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Tiago", 0, new Data(20, 4, 2003)));
        c3.add(new Pessoa("Joaquim", 1, new Data(12, 2, 2001)));
        c3.add(new Pessoa("Euclidiano", 2, new Data(2, 8, 2004)));
        c3.add(new Pessoa("Anastácio", 3, new Data(27, 10, 2007)));
        c3.add(new Pessoa("Clementina", 4, new Data(30, 12, 2010)));
        System.out.println(c3);
        Iterator<Pessoa> itPessoa = c3.iterator();
        itPessoa.forEachRemaining(s -> {
            System.out.println(s);
        });

        
    }
}
