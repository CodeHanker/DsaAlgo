package Competitive_Prog.Leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class P_13_RomanToInteger {

    /*
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    Complexity
        Time complexity: O(n)
        Space complexity: O(1)
     */


    /*
    Approach 1:
    Roman char, and it's corresponding integer value saved to Char-Integer Map
    Starting from right to left, First char's integer value is saved to result.
    In a for loop, Starting processing from right to left
    Then comparing two char's integer value at one go, if left char's integer value is lower than
    the right char's integer value, then we subtract left value from result else we add  it to result
    */

    public int romanToInt1(String s) {
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1); romanToIntMap.put('V', 5); romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50); romanToIntMap.put('C', 100); romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
        int resultedInteger = romanToIntMap.get(s.charAt(s.length()-1));
        for (int i=s.length()-2; i>=0; i--) {
            int prev = romanToIntMap.get(s.charAt(i));
            int num = romanToIntMap.get(s.charAt(i+1));
            if (prev < num) {
                resultedInteger -= prev;
            } else {
                resultedInteger += prev;
            }
        }
        return resultedInteger;
    }

    /*
    Approach 1:
    In a for loop, processing character's value from right to left,
    Variable prev and result variable initialed to zero
    Num (Integer value) of a Roman char is picked up through switch case
    Then this number and it adjacent char's value is compared
    if num is greater than and equal to prev then num is added to result
    else num is subtracted from result
    after this comparison, current num is assigned to prev so that it becomes previous value
    */

    public int romanToInt2(String s) {
        int result=0, num=0, prev=0;
        for (int i=s.length()-1; i>=0; i--) {
            switch (s.charAt(i)) {
                case 'I' : num = 1; break;
                case 'V' : num = 5; break;
                case 'X' : num = 10; break;
                case 'L' : num = 50; break;
                case 'C' : num = 100; break;
                case 'D' : num = 500; break;
                case 'M' : num = 1000; break;
            }
            if (num >= prev) {
                result += num;
            } else {
                result -= num;
            }
            prev = num;
        }
        return result;
    }

    public static void main(String[] args) {
        P_13_RomanToInteger p_13_romanToInteger = new P_13_RomanToInteger();
        String input = "MCMXCIV";
        int result1 = p_13_romanToInteger.romanToInt1(input);
        System.out.println("result: " + result1);
        int result2 = p_13_romanToInteger.romanToInt2(input);
        System.out.println("result: " + result2);
    }
}
