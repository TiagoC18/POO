package aula02;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        double Mi;
        float Tj;
        System.out.print("Montante investido: ");
        Scanner mi= new Scanner (System.in);
        Mi= mi.nextDouble();
        System.out.print("Taxa de juro mensal: ");
        Tj= mi.nextFloat();
        Tj= Tj/100;
        mi.close();
        for (int i=1; i<=3; i++){
            Mi+= (Tj*Mi);
        }
        System.out.println("O valor total ao fim de 3 meses será: " + Mi + "euros");
        
    }
    
}
