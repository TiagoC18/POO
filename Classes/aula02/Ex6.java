package aula02;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int seg, min, h;
        Scanner sc= new Scanner (System.in);
        System.out.print("Tempo em segundos: ");
        seg= sc.nextInt();
        h= seg/3600;
        min= (seg%3600)/60;
        seg= (seg%3600)%60;
        sc.close();
        System.out.println(h+":"+min+":"+seg);
    }
    
}
