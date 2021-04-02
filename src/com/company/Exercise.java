package com.company;

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
//        exercise9();
//        exercise10();
//        exercise11();
//        exercise12();
//        exercise13();
//        exercise14();
//        exercise15();
//        extraRandomPractice();
//        exercise16();
//        exercise17();

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
    public static void exercise10(){
        double res = area(9.4);
        System.out.println("Area of a circle with radius 9.4 is: " + res);
        res = area(12, 6);
        System.out.println("Area of a rectangle  with x of 12 and y of 6 is: " + res);
        res = area(-1, 9);
        System.out.println("Area of a circle with x = -1 and y of 9 is: " + res);
    }
    public static double area(double radius){
        if(radius <0){
            return -1;
        }else{
            return radius * radius * Math.PI;
        }
    }
    public static double area(double x, double y ){
        if(x <0 || y <0){
            return -1;
        }else{
            return x* y;
        }
    }
    public static void exercise11(){
        printYearsAndDays(48000);
        printYearsAndDays(900);
        printYearsAndDays(40);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid value");
        }else{
            long aYear = 60*24 * 365;
            long aDay = 60*24;
            long years = minutes /aYear;
            long days = (minutes %aYear) / aDay;
            System.out.println(minutes + "m = " + years + "y and "+ days + "d");
        }
    }
    public static void exercise12(){
        printEqual(10, 10, 10);
        printEqual(9,-3, 2);
        printEqual(12,9, 4);
        printEqual(4, 4, 12);
    }
    public static void printEqual(int num1, int num2, int num3){
        if(num1 <0 || num2 < 0 || num3 < 0){
            System.out.println("Invalid value");
        }else if (num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        }else if (num1 != num2 && num2 != num3 && num3 != num1){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither are all equal or different");
        }
    }
    public static void exercise13(){
        boolean res = isCatPlaying(false, 95);
        checkCat(res);
        res = isCatPlaying(true, 38);
        checkCat(res);
        res = isCatPlaying(false,31);
        checkCat(res);
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(temperature <25 && temperature >35){
            return false;
        }else if(summer == true && temperature >=25 && temperature <=45){
            return true;
        }else if(temperature >=25 && temperature <=35){
            return true;
        }else{
            return false;
        }
    }
    public static void checkCat(boolean result){
        if(result == true){
            System.out.println("Cat is playing!");
        }else{
            System.out.println("Cat too hot and is asleep in the shade");
        }
    }
    public static void exercise14(){
        printDayOfTheWeek(3);
        printDayOfTheWeek(6);
        printDayOfTheWeek(9);
        printDayOfTheWeek(2);
    }
    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
    public static void exercise15(){
       int  daysofMonth = getDaysInMonth(12, 2009);
       System.out.println("Month 12 of year 2009 has these many days:" +daysofMonth);
        daysofMonth = getDaysInMonth(9, 1983);
        System.out.println("Month 9 of year 1983 has these many days:" +daysofMonth);
        daysofMonth = getDaysInMonth(2, 2020);
        System.out.println("Month 2 of year 2020 has these many days:" +daysofMonth);
    }
    public static int getDaysInMonth(int month, int year){
        if(month <1 || month >12){
            return -1;
        }else if (year <1 || year >9999){
            return -1;
        }else if(isLeapYear(year) && month ==2){
            return 29;
        }

        switch(month){
            case 11: case 4: case 6: case9:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }
    }
    public static void extraRandomPractice() {
        //interestForPractice();
        // primeNumberPractice();
        //sum3And5();
        //evenChecking();
//        System.out.println("Sum of digits in number 125 is:" + sumDigits(125));
//        System.out.println("Sum of digits in number -125 is:" + sumDigits(-125));
//        System.out.println("Sum of digits in number 4 is:" + sumDigits(4));
//        System.out.println("Sum of digits in number 32123 is:" + sumDigits(32123));
        System.out.println(isPalidrome(11));
        System.out.println(isPalidrome(23));
        System.out.println(isPalidrome(-31));
        System.out.println(isPalidrome(10001));

    }
    public static boolean isPalidrome(int number){
        if(number <0){
            number *=1;
        }
        int num = number;
        int reverse = 0;
        while(num >0){
            int lastDigit = num %10;
            reverse = reverse*10 + lastDigit;
            num /=10;
        }
        if(reverse == number){
            return true;
        }else{
            return false;
        }
    }
    public static int sumDigits(int number){
        if(number <10){
            return -1;
        }
        int sum = 0;
        while(number >0){
           int digit = number %10;
           sum +=digit;
           number /=10;
        }
        return sum;
    }
    public static void evenChecking(){
        int start = 2;
        int end = 50;
        while (start <= end) {
            boolean result = isEvenNumber(start);
            if (result == true) {
                System.out.println(start + " is an even number");
            }
            start++;
        }

    }
    public static boolean isEvenNumber(int num){
        if(num%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void sum3And5(){
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            if((i%3 == 0) && (i% 5==0)){
                System.out.println(i);
                sum +=i;
                count++;
                if(count ==5){
                    break;
                }
            }
        }
        System.out.println("Sum of numbers divisible by 3 and 5 are:" + sum);
    }
    public static void primeNumberPractice(){
        //For a range of numbers, determine if the number is a prime number using the isPrime method.
        //IF it is a prime number, print it out and icnrement a count of the number of primes found.
        int count = 0;
        for(int i = 10; i <50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count ==10){
                    System.out.println("Exit loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if(n ==1){
            return false;
        }

        for(int i=2; i <= (long) Math.sqrt(n); i++){
            if (n % i == 0) {

                return false;
            }
        }
        return true;
    }
    public static void interestForPractice(){
        for(int i = 2; i < 9; i ++){
            System.out.println("10,000 at" + i + " %interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("********");
        for(int i = 8; i >=2; i--){
            System.out.println("10,000 at" + i + " %interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return(amount* (interestRate * 100));
    }
    public static void exercise16(){
        System.out.println(hasSharedDigit(19, 13));
        System.out.println(hasSharedDigit(124, 268));
        System.out.println(hasSharedDigit(1, 19));
        System.out.println(hasSharedDigit(87, 28));
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(2,22,71));
        System.out.println(hasSameLastDigit(23,32,42));

    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if(isValid(n1) && isValid(n2) && isValid(n3)){
            n1%=10;
            n2%=10;
            n3%=10;
            return(n1==n2) || (n1==n3) ||(n2 ==n3);
        }
        return false;
    }
    public static boolean isValid(int n){
        if(n >1000 || n < 10){
            return false;
        }
        return true;
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 > 99 || num1 <10) || (num2>99 || num2 <10)){
            return false;
        }
        int n1 = num1;
        while(n1>0){
            int n2 = num2;
            while(n2 >0){
                if(n1 %10 == n2%10){
                    return true;
                }
                n2 /=10;
            }
            n1/=10;
        }
        return false;
    }
    public static void exercise17(){
        System.out.println(greatestCommonDivisor(45,15));
        System.out.println(greatestCommonDivisor(16,40));
        System.out.println(greatestCommonDivisor(100,65));

    }
    public static int greatestCommonDivisor(int n1, int n2){
        if(n1 <10 || n2 <10){
            return -1;
        }
        int min = n1 < n2? n1: n2;
        for(int i = min; i >1; i--){
            if(n1%i == 0 && n2%i==0){
                return i;
            }
        }
        return 1;
    }
}
