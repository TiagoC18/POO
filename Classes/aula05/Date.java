package aula05;
import java.time.OffsetDateTime;
public class Date {
    public Date(int d, int m, int a) {
    }
    public static boolean validMonth(int month){
        if (month>=1 && month<=12){
            return true;
        }
        else{
            return false;
        }
    }
    public static int monthDays(int month, int year){
        int dias;
    int[] diasm = {31,00,31,30,31,30,31,31,30,31,30,31};
    if (validMonth(month)==true){
        if( month==2){
            if((year%100 != 0 && year%4 == 0) || year%400 == 0){
                dias = 29;
            }
            else{
                dias = 28;
            }
        } 
        else{
            dias = diasm[month-1];
        }
        return dias;
    }
    else{
        return 0;
    }
    
}

    public static boolean leapYear(int year){
        if((year%100 != 0 && year%4 == 0) || year%400 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean valid(int day, int month, int year){
        if (month>=1 && month<=12){
            if( month==2){
                if((year%100 != 0 && year%4 == 0) || year%400 == 0){
                    if (day>=29 || day<=1){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
                else{
                    if (day>=28 || day<=1){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
            } 
            else{
                if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                    if (day>=31 || day<=1){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
                else{
                    if (day>=30 || day<=1){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
            }
            
        }
        else{
            return false;
        }
}

public static Date today() {
        OffsetDateTime dt = OffsetDateTime.now();
        int d = dt.getDayOfMonth();
        int m = dt.getMonthValue();
        int a = dt.getYear();

        return new Date(d, m, a);
    }
}

