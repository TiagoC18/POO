package aula04;
//import java.util.Arrays;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduza uma frase: ");
        String s= sc.nextLine();
        String S= s.toUpperCase();
        sc.close();
        String[] splitted= S.split("\\W");
        //String My= Arrays.toString(splitted);
        for (int i=0; i<splitted.length; i++){
            if (splitted[i].length()>3){
               System.out.print(splitted[i].charAt(0));
                
            }
        }

    }
    
}
