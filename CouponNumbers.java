package com.mycompany.logicalprogramsdec09;

public class CouponNumbers {
    public void couponNumbers(int arr_coup[]){
        boolean dist_coup_num_found = false;
        int rand_num_need = 0;
        while (dist_coup_num_found==false){
            // Generate a random number
            double rand_num = Math.round(Math.floor(Math.random()*100));
            // compare random number to each number in coupon number array
            for (int i=0;i<arr_coup.length;i++){
                if (rand_num==arr_coup[i]){
                    dist_coup_num_found = false;
                    rand_num_need ++;
                    break;
                }else {
                    dist_coup_num_found = true;
                }
            }
            System.out.println("Distinct coupon number = "+rand_num);
            rand_num_need++;
        }
        System.out.println("The number of random numbers needed to get a distinct"
                + " coupon number = "+rand_num_need);
    }
    public static void main(String []args){
        CouponNumbers cn = new CouponNumbers();
        int arr_coup[] = {11,14,37,67,89,91};
        cn.couponNumbers(arr_coup);   
    }
}
