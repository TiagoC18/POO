package aula02;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        float x1,y1,x2,y2;
        Scanner sc= new Scanner(System.in);
        System.out.println("P1: ");
        System.out.print("X: ");
        x1=sc.nextFloat();
        System.out.print("Y: ");
        y1=sc.nextFloat();
        System.out.println("P2: ");
        System.out.print("X: ");
        x2=sc.nextFloat();
        System.out.print("Y: ");
        y2=sc.nextFloat();
        sc.close();
        double x=Math.pow((x2-x1), 2);
        double y=Math.pow((y2-y1), 2);
        double d=Math.sqrt((x+y));
        System.out.printf("Distancia media entre os 2 pontos é: %.3f",d);
    }
    
}