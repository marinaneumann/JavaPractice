import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();

    }
    public static void exercise1(){
        System.out.println("Speed converter");
        Scanner in = new Scanner(System.in);
        System.out.println("Kilometers to convert to miles:");
        double number = in.nextDouble();
        printConversion(number);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }else{
            return Math.round(kilometersPerHour/ 1.609d);
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour <0){
            System.out.println("Invalid Value");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
    public static void exercise2(){
        System.out.println("MegaBytes Converter");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        printMegaByesAndKiloBytes(input);
    }
    public static void printMegaByesAndKiloBytes(int kiloBytes){
        if(kiloBytes <0){
            System.out.println("Invalid Value");
        }else{
            int megabytes = kiloBytes /1024;
            int remaining = kiloBytes %1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remaining + " KB");
        }
    }
    public static void exercise3(){
        boolean res = shouldWakeUp(true, 16);
        alert(res);
        res = shouldWakeUp(false, 9);
        alert(res);
        res = shouldWakeUp(true, 6);
        alert(res);
        res = shouldWakeUp(true, 24);
        alert(res);

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay >23){
            return false;
        }else if(barking == true && hourOfDay <8 || hourOfDay >22){
            return true;
        }else{
            return false;
        }
    }

    public static void alert(boolean res){
        if(res == true){
            System.out.println("YOU NEED TO WAKE UP!!");
        }else{
            System.out.println("Forget Me You Should....");
        }
    }
    public static void exercise4(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year to check if leap year:");
        int year = in.nextInt();
        boolean leaping = isLeapYear(year);
        check(leaping);
    }
    public static boolean isLeapYear(int year){
        if(year <1 || year >9999){
            return false;
        }else{
            if(year %4 == 0){
                if(year%100 == 0){
                    if(year%400 == 0){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return true;
                }
            }else{
                return false;
            }
        }
    }
    public static void check(boolean leap){
        if(leap == true) {
            System.out.println("It's a LEAP YEAR!!!)");
        }else{
            System.out.println("not a leap year... whatever??");
        }
    }
}
