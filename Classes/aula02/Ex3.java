package aula02;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        double Q, M, Ti, Tf;
        System.out.print("Quantidade de água: ");
        Scanner m= new Scanner (System.in);
        M= m.nextDouble();
        System.out.print("Temperatura inicial: ");
        Scanner ti= new Scanner (System.in);
        Ti= ti.nextDouble();
        System.out.print("Temperatura final: ");
        Scanner tf= new Scanner (System.in);
        Tf= tf.nextDouble();
        Q = M* (Tf-Ti)*4184;
        System.out.println("O valor é: " + Q);
        m.close();
        ti.close();
        tf.close();
    }
    
}
