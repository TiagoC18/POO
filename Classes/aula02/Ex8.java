package aula02;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        double catA, catB, hip, hip2, a;
        Scanner sc= new Scanner(System.in);
        System.out.print("Valor do catateto A: ");
        catA= sc.nextDouble();
        System.out.print("Valor do catateto B: ");
        catB= sc.nextDouble();
        hip2= Math.pow(catA, 2) + Math.pow(catB, 2);
        hip= Math.sqrt(hip2);
        a= Math.cos(catA/hip);
        a= Math.toDegrees(a);
        sc.close();
        System.out.printf("O valor da hipotenusa será %.2f e o valor do ângulo será %.3f.", hip, a);
    }
    
}
