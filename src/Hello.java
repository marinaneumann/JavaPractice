import java.math.*;
import java.util.*;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello YOU");
        int num4 = basic();
        int challengeNum = challenge1(num4);
        System.out.println(challengeNum);
        practice1();
        long res = challenge2();
        System.out.print("Result of Challenge2: " + res);
        float it = floatPractice();
        System.out.println("Float thing: " + it);
        double thing = challenge3();
        System.out.println("Result of Challenge3:" + thing);
        charBoolPractice();
        boolean alive = conditionalLogicPractice();
        if (!alive) {
            System.out.println("sorry you're dead :( ");
        }
        challenge4();
    }

    public static int basic() {
        int num1 = 10;
        int num2 = (num1 + 5) * 20;
        int num3 = num1 + num2;
        int num4 = num1 + num2 + num3;
        System.out.println(num4);
        return num4;
    }

    public static int challenge1(int number) {
        int myLastOne = number - 1000;
        return myLastOne;
    }

    public static void practice1() {
        int value1 = 10000;
        int value2 = 50000;
        int min = Math.min(value1, value2);
        int max = Math.max(value1, value2);
        System.out.println("Minimum value is: " + min);
        System.out.println("Maximum value is:" + max);

        //Byte has 8 bits.
        //Short has 16 bits
        //Int has 32 bits
        //Long ahs 64 bits.
        int num = 300000;
        //Example of casting
        byte num2 = (byte) (num / 2);
        System.out.println(num2);
    }

    public static long challenge2() {
        byte num1 = (byte) 10;
        short num2 = (short) 20;
        int num3 = 50;
        //long result = (long)50000 + 10* (num1 + num2 + num3);
        long result = 50000L + 10L * (num1 + num2 + num3);
        return result;
    }

    public static float floatPractice() {
        float a = 4 / 3;
        float b = 9.7f;
        double c = 4.39291d;
        double d = 8.311112d / 6;
        int n = 4 / 3;

        float thing = (float) c;
        thing /= 3;
        System.out.println("Float: " + a);
        System.out.println("Double:" + d);
        System.out.println("Int: " + n);
        return thing;

    }

    public static double challenge3() {
        int pounds = 300;
        double kilo = 0.45359237;
        double kiloConvert = (double) (pounds * kilo);
        return kiloConvert;
    }

    public static void charBoolPractice() {
        char m = 'm';
        char unicodeCharM = '\u006d';
        boolean alive = true;
        //String name =" Marina";
        //Char is 16 bits.
        System.out.println(m);
        System.out.println(unicodeCharM);
        System.out.println(alive);
        Scanner in = new Scanner(System.in);
        System.out.println("Who are you?");
        String name = in.nextLine();
        System.out.println("Hello, " + name);

    }

    public static boolean conditionalLogicPractice() {
        Scanner in = new Scanner(System.in);
        System.out.println("Are you alive?");
        String result = in.nextLine();
        boolean noBueno = false;
        if (result.equals("yes") || result.equals("no")) {
            noBueno = true;
        }
        boolean alive;
        while(noBueno == false){
            result = in.nextLine();
            result = result.toLowerCase();
            if (result.equals("yes") || result.equals("no")) {
                noBueno = true;
            }else {
                System.out.println("Not valid answer for existence... yes or no");
            }
        }

        if (result.equals("yes")) {
            alive = true;
        } else {
            alive = false;
        }
        return alive;
    }

    public static void challenge4(){
        double val = 20.00d;
        double second = 80.00d;
        double num = 100.00 * (val + second);
        System.out.println("Number:" + num);
        double remainder = (num % 40.00d);
        System.out.println("Remainder:" + remainder);
        boolean result = (remainder == 0) ? true : false;
        System.out.println("Result is: " + result );
        if(!result){
            System.out.println("Got some remainder");
        }


    }

}

