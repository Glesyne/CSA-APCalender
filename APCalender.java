public class APCalender{


    private static boolean isLeapYear(int year){
        return (year%4==0) && (!(year%100==0) || (year%400==0)); 
    }

    public static int numberOfLeapYears(int yeara, int yearb){
        int count = 0; 
        for (int i = yeara; i<=yearb; i++){
            if (isLeapYear(i)){
                count++; 
            }
        }
        return count; 
    }

    private static int firstDayOfYear(int year){
        int day = 1; 
        for (int i = 1; i<year; i++){
            day++; 
            if (isLeapYear(i)){
                day++; 
            }
        }
        return day%7; 
    }

    private static int dayOfYear(int month, int day, int year){
        int res = 0; 
        if (month>1){
            res +=31; 
        }
        if (month>2){
            res += 28; 
        }
        if (isLeapYear(year)){
            res++; 
        }
        if (month>3){
            res +=31; 
        }
        if (month>4){
            res +=30; 
        }
        if (month>5){
            res +=31; 
        }
        if (month>6){
            res +=30; 
        }
        if (month>7){
            res +=31; 
        }
        if (month>8){
            res +=31; 
        }
        if (month>9){
            res +=30; 
        }
        if (month>10){
            res +=31; 
        }
        if (month>11){
            res +=30; 
        }
        if (month>12){
            res +=31; 
        }
        res += day; 
        return res; 
    }

    public static int dayOfWeek(int month, int day, int year){
        int res = dayOfYear(month, day, year) % 7; 
        return firstDayOfYear(year) + res -1; 
    }
    
}
