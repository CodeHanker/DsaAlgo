package Competitive_Prog.Common.Additional;


public class ReverseNumber {

    //Reverse number without recursion
    public int getReversedNumber(int num) {
        int reversedNum = 0;
        while(num != 0) {
            reversedNum = (reversedNum*10) + (num % 10);
            num /= 10;
        }
        return reversedNum;
    }

    //Reverse number with recursion
    public static int getReversedNumRecursive(int num) {
        //123 -> 321
        int rev = 0;
        return reverseRecursively(num, rev);
    }
    public static int reverseRecursively(int num, int rev) {
        if(num == 0) {
            return rev;
        }
        return reverseRecursively(num / 10, rev * 10 +  num % 10);
        //return num == 0 ? rev : reverseRecursively(num / 10, rev * 10 +  num % 10);
    }

    public static void main(String[] args) {
        int numberInput = 123456;
        int reversedNumber = getReversedNumRecursive(numberInput);
        System.out.println("InputNum: " + numberInput + " and it's reversedNumber : " + reversedNumber);
        int reversedNumberRec = getReversedNumRecursive(numberInput);
        System.out.println("InputNum: " + numberInput + " and it's reversedNumberRec : " + reversedNumberRec);
    }
}
