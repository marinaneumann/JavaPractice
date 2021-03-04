import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        exercise5();
//        exercise6();
//        exercise7();
//        exercise8();
        exercise9();

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
    public static void exercise5(){
        Scanner in = new Scanner(System.in);
        System.out.println("Compare decimals, enter 2 numbers for comparison");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        boolean check = areEqualByThreeDecimalPlaces(num1,num2);
        if(check == true){
            System.out.println(num1 + " and " + num2 + " are equal by three decimal places!");
        }
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        if((int)(num1 *1000) == (int)(num2*1000)){
            return true;
        }else{
            return false;
        }
    }
    public static void exercise6(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers to check if sum of first and second number is equal to third:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        boolean check = hasEqualSum(num1, num2, num3);
        if(check == true){
            System.out.println("Yup");
        }
    }
    public static boolean hasEqualSum(int num1, int num2, int num3){
        return ((num1+num2) == num3);
//        if((num1 + num2) == num3){
//            return true;
//        }else{
//           return false;
//        }
    }
    public static void exercise7(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers to check if a 'teen' number (between 13-19) :");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        boolean check = hasTeen(num1,num2, num3);
        if(check == false){
            System.out.println("NONE of those ages were a 'teen' year...");
        }
    }
    public static boolean hasTeen(int num1, int num2,int num3){
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }
    public static boolean isTeen(int num){
//        if(num <=19 && num >=13){
//            return true;
//        }else{
//            return false;
//        }
        return(num <=19 && num >=13)? true: false ;
    }
    public static void exercise8(){
        // Method to calculate Feet and inchines to centimeters but with different parameters
        double result = calcFeetAndInchesToCentimeters(23.43);
        System.out.println("Centimeter conversion is: " + result);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet <0 || (inches <0 && inches >12)){
            return -1;
        }else{
            //1 inch =  2.54 cm and 1ft = 12in
            double feetToInch = feet * 12;
            System.out.println("Feet =" + feetToInch);
            System.out.println("Inches =" + inches);
            double cm2 = (feetToInch + inches) *2.54;
            System.out.println("Inches to Centimeters Total : " + cm2);
            return cm2;
            //double cent = feet * 12;
            //cent += inches *2.54;

        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches <0){
            return -1;
        }else{
            double feet = (int)inches / 12;
            double rem = (int) inches %12;
            System.out.println(inches + "inches is equal to" + feet + "ft and "+ rem);
            return calcFeetAndInchesToCentimeters(feet, inches);
        }
    }
    public static void exercise9(){
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter time for conversion, first minutes, then seconds");
        System.out.println("Enter time for conversion of  seconds");
        //int min = in.nextInt();
        int sec = in.nextInt();
        String result = getDurationString(sec);
        //String result = getDurationString(min, sec);
        System.out.println(result);
    }
    private static String getDurationString(long minutes,long seconds){
        if(minutes <0 || seconds <0 && seconds >59 ){
            return "Invalid Value";
        }else{
            long hours = minutes / 60;
            minutes = minutes %60;
            seconds = minutes *60;
            return(hours + "h " + minutes + "m " + seconds +"s ");
        }
    }
    private static String getDurationString(long seconds){
        if(seconds <0){
            return "Invalid value";
        }else{
            long min = seconds /60;
            return getDurationString(min, seconds);
        }
    }
}
