package aula05;
import java. util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Mês entre 1 e 12: ");
        int month= sc.nextInt();
        System.out.print("O mês é válido: ");
        System.out.println(Date.validMonth(month));
        System.out.print("Ano: ");
        int year= sc.nextInt();
        System.out.print("Dia: ");
        int day= sc.nextInt();
        System.out.print("Nesse ano o mês tem: ");
        System.out.println(Date.monthDays(month, year));
        System.out.print("É um ano bissexto: ");
        System.out.println(Date.leapYear(year));
        System.out.print("A data é válida: ");
        System.out.println(Date.valid(day, month, year));
        


        System.out.print("Date operations: \n 1 - create new date \n 2 - show current date \n 3 - increment date \n 4 - decrement date \n 0 - exit");
        int choice= sc.nextInt();
        sc.close();
        if (choice==1){
            set(day, month, year);
        }
    }

    private static void set(int day, int month, int year) {
        
    }

}
