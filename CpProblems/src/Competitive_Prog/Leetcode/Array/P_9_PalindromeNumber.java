package Competitive_Prog.Leetcode.Array;

public class P_9_PalindromeNumber {
    /*
    Problem:
        Checking a number for palindrome without converting it to string
    Approach 1:
        Reversing the entire number
        First we check if no. is negative or not, if negative, return false
        We also check, if number is with leading zeros, so if is divisible
        by zero, it can not be a palindrome.
        Then We first reverse the number using module and divide technique,
        then we subtract this number from the input number, if we get zero
        it will be a palindrome and true will be returned else false means
        not a palindrome
    */
    public boolean isPalindrome(int x) {
        if (x <= 0 || (x%10 ==  0)) {
            return false;
        }
        int tempNum = x;
        int reversedNum = 0;
        while(tempNum != 0) {
            reversedNum = (reversedNum*10) + (tempNum % 10);
            tempNum /= 10;
        }
        return (reversedNum == x);
    }

    /*
    Problem:
        Checking a number for palindrome without converting it to string
    Approach 2:
        Reversing half of the number

        First we check if no. is negative or not, if negative, return false
        We also check, if number is with leading zeros, so if is divisible
        by zero, it can not be a palindrome.

        As loop gets completed, we reversed second half of the digits.
        we compare first half of digits (x) with the reversed second half
        of the digits (reversedNum) to determine palindrome case.
        For even number of digits, x is equal to reversedNum, and true is return
        For odd number of digits, x is equal to reversedNum/10 (ignoring the middle digit),
            and true is returned
        If both case get failed, we return false
    */

    public boolean isPalindrome2(int x) {
        if (x <= 0 || (x%10 ==  0)) {
            return false;
        }
        int halfNum = 0;
        while(x > halfNum) {
            halfNum = (halfNum*10) + (x % 10);
            x /= 10;
        }
        return (x == halfNum) || (x == halfNum/10);
    }

    public static void main(String[] args) {
        P_9_PalindromeNumber p_9_PalindromeNumber = new P_9_PalindromeNumber();
        int numberInput = 41414;
        boolean isNumPalindrome = p_9_PalindromeNumber.isPalindrome(numberInput);
        System.out.println("1 using entireReversedNum=> Is number " + numberInput + " a Palindrome : " + isNumPalindrome);
        int number2 = 72527;
        boolean isNumPalindrome2 = p_9_PalindromeNumber.isPalindrome2(number2);
        System.out.println("2 using halfReversedNum => Is number " + number2 + " a Palindrome : " + isNumPalindrome);
    }
}
