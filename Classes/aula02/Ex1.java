package aula02;
import java.util.Scanner;
public class Ex1  {
    public static void main(String[] args) {
        double km, miles;
        System.out.print("Distância em km: ");
        Scanner v= new Scanner (System.in);
        km= v.nextDouble();
        miles= km/1.609;
        System.out.println("Em milhas é: " + miles);
        v.close();
    }
}