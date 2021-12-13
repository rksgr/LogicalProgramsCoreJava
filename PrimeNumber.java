
package com.mycompany.logicalprogramsdec09;

public class PrimeNumber {
    public void primeNumber(int num){
        boolean is_prime = true;
        // check if it is divisible by any number
        for (int i=2;i<=num/2;i++){
            if (num%i==0){
                is_prime = false;
                break;
            }
        }
        
        if (is_prime==true){
            System.out.println("The number "+ num + " is a prime number.");
        }else{
            System.out.println("The number "+ num + " is not a prime number.");
        }
    }
    public static void main(String []args){
        //create an instance and invoke method
        PrimeNumber pn = new PrimeNumber();
        pn.primeNumber(139);
    }
}
