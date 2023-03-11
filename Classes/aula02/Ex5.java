package aula02;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        double v1, v2, d1, d2, t1, t2, vm;
        Scanner sc= new Scanner (System.in);
        System.out.print("Velocidade 1: ");
        v1= sc.nextDouble();
        System.out.print("Distância 1: ");
        d1= sc.nextDouble();
        System.out.print("Velocidade 2: ");
        v2= sc.nextDouble();
        System.out.print("Distância 2: ");
        d2= sc.nextDouble();
        sc.close();
        t1= d1/v1;
        t2= d2/v2;
        vm= (d1+d2)/(t1+t2);
        System.out.println("O valor da velocidade média será: " + vm + "km/h");

    }
    
}
