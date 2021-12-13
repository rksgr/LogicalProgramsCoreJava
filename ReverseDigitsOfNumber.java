package com.mycompany.logicalprogramsdec09;
import java.util.Scanner;

public class ReverseDigitsOfNumber {
    public void reverseDigitsOfNumber(int num){
        final int NUMBER = num;
        // variables
        int num_of_digits = 0;
        int quot = num;
        // Number successively divided by 10, till quotient is greater than zero
         while (quot>0){
             quot = num/10;
             num = quot;
             num_of_digits++;
         }
         System.out.println("The number of digits in the given number = "+ num_of_digits);
         // Declare an array to store all the digits of array
         int arr_num[] = new int[num_of_digits];
         int j = num_of_digits-1;
         num = NUMBER;
         while (j>-1){
             arr_num[j] = num%10;
             num = num/10;
             j--;
         }
         System.out.println("1st digit= "+arr_num[0]+" last digit = "+ arr_num[num_of_digits-1]);
         //Multiply the elements of array with placeholders in reverse order to obtain number in reverse
         int num_rev = 0;
         for (int k=0;k<arr_num.length;k++){
             num_rev += (arr_num[k]*(Math.pow(10,k)));
         }
         System.out.println("The number obtained by reversing the digits = " + num_rev);
        }
    public static void main(String []args){
        ReverseDigitsOfNumber rdn = new ReverseDigitsOfNumber();
        //rdn.reverseDigitsOfNumber(10777);
        rdn.reverseDigitsOfNumber(25852173);
    }
    
}
