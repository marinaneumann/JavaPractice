import java.math.*;


public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World");
        int num1 = 10;
        int num2 = (num1 + 5) *20;
        int num3 = num1 + num2;
        int num4 = num1 + num2 + num3;
        System.out.println(num4);
        int challengeNum = challenge1(num4);
        System.out.println(challengeNum);
        practice1();
    }

    public static int challenge1(int number){
        int myLastOne = number -1000;
        return myLastOne;
    }

    public static void practice1(){
        int value1 = 10000;
        int value2 = 50000;
        int min =  Math.min(value1, value2);
        int max = Math.max(value1, value2);
        System.out.println("Minimum value is: " + min);
        System.out.println("Maximum value is:" + max);

    }
}
