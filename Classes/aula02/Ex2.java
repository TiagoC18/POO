package aula02;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        double C, F;
        System.out.print("Temperatura em graus C: ");
        Scanner c= new Scanner (System.in);
        C= c.nextDouble();
        F= 1.8*C + 32;
        System.out.println("A temperatura em Fahrenheit é: " + F);
        c.close();
    }
    
}
