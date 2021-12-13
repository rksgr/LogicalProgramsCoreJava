
package com.mycompany.logicalprogramsdec09;


public class PerfectNumber {
    public void perfectNumber(int num){
        // variables
        int sum_of_divisors = 1;
        // check divisors
        for (int i=2;i<=num/2;i++){
            if (num%i==0){
                sum_of_divisors +=i;
            }
        }
        // comparison
        if (sum_of_divisors==num){
            System.out.println(" The number "+ num+ " is a perfect number");
        }else {
            System.out.println(" The number "+ num+ " is not a perfect number");
        }
    }
    public static void main(String []args){
        PerfectNumber pn = new PerfectNumber();
        pn.perfectNumber(28);
    }
}
