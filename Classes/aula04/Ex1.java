package aula04;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Palavra, frase ou parágrafo: ");
        String funny = sc.nextLine();
        System.out.println("Tudo em minúsculas será: " + funny.toLowerCase());
        System.out.println("O último carater é: " + funny.charAt(funny.length() - 1));
        System.out.println("Os 3 1ºs carateres são: "+ funny.substring(0,3));
        System.out.println("Sem espaços ficará: " + funny.trim());
        for(char c : funny.toCharArray()){
            System.out.println(c);
        }
        System.out.println("Tudo em maiúsculas será: " + funny.toUpperCase());
        sc.close();
    }
    
}
