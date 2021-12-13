
package com.mycompany.logicalprogramsdec09;


public class FibonacciSeries {
    public void fibonacciSeries(int target_num){
        int num1 = 0;
        int num2 = 1;
        int next_num = 1;
        System.out.println(" The fibonacci series upto " + target_num + " is: ");
        for (int i =0; i<target_num;i++){
            next_num = num1 + num2;
            num1 = num2;
            num2 = next_num;
            i = next_num;
            System.out.println(next_num);
        }
    }
    public static void main(String []args){
        FibonacciSeries fs = new FibonacciSeries();
        fs.fibonacciSeries(37);
    }
}
