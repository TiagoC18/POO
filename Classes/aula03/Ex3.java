package aula03;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int i,m, n, val=0; 
        Scanner sc= new Scanner(System.in);
        System.out.println("Número inteiro positivo:(0=STOP) ");
        n=sc.nextInt();
        m=n/2;        
        while (n!=0){
            if (n>2){
                for(i=2;i<=m;i++){      
                    if(n%i==0){      
                        System.out.println(n+" não é número primo");      
                        val=1;      
                        break;      
                    }       
                }
                if(val==0)  { System.out.println(n+" é número primo"); }
            }
            else{
                if(n==1){  
                    System.out.println(n+" não é número primo");}
                else{
                    if(n==2){  
                        System.out.println(n+" é número primo");}
                    else{
                        System.out.println("Numero inválido!");}
                    }
            } 
            val=0;
            System.out.println("Numero inteiro positivo:(0=STOP) ");
            n=sc.nextInt();
           
        }
        sc.close();
    }
}