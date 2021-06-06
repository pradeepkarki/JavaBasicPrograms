package com.java.programs.faq;

/**
 *
 * Armstrong Number in Java: A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
 *
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 *
 */
public class ArmStrongNumber {
    public static void main(String[] args) {
        int num =154;
        int temp=num;
        int res=0,rem=0;
        while(num>0)
        {
            rem = num%10;
            num = num/10;
            res = res + (rem*rem*rem);
        }
        if(res==temp)
            System.out.println("Number is armstrong");
        else
            System.out.println("Number is not armstrong");
    }
}
