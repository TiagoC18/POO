package aula04;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Palavra, frase ou parágrafo: ");
        String s = sc.nextLine();
        sc.close();
        countDigits(s);
        countSpaces(s);
        isUpper(s);
        isPalindrome(s);
        
        
        
    }
    public static void countDigits(String s){
        int count=0;
        for (int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        System.out.println("Esta frase apesenta "+ count + " digitos");
    }
    public static void countSpaces(String s){
        int spaces=0;
        for(char c : s.toCharArray()){
            if(c== ' '){
                spaces++;
            }        
        }
        System.out.println("Esta frase apesenta "+ spaces + " espaços");
    }
    public static void isUpper(String s){
        if (s.toLowerCase() == s){
            System.out.println("Esta frase só contém minúsculas");
        }
        else{
            System.out.println("Esta frase contém maiúsculas");
        }
    }
    public static void isPalindrome(String s){
        StringBuilder sb= new StringBuilder();
        for (int i= (s.length()-1); i>=0; i--){
            sb.append(s.charAt(i));
        }
        if (s.equals(sb.toString())){
            System.out.print("É palíndrome");
        }
        else{
            System.out.println("Não é palíndrome");
        }
        
    }

}
