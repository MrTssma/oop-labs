
package com.chnu.oop.lab02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.print("Вводить числа самому?(0 - нет, 1 - да) \n");
        int i = inn.nextInt();
        if ((i<=1) & (i>=0)) {
            float x,a,b,c;
            if (i == 0) {
                x = -3.2f;  a = -7.1f; b = 4.1f; c = 5f;
            } else {
                System.out.print("x =  \n");
                x = inn.nextFloat();
                System.out.print("a =  \n");
                a = inn.nextFloat();
                System.out.print("b =  \n");
                b = inn.nextFloat();
                System.out.print("c =  \n");
                c = inn.nextFloat();
            }
            
            double r = Math.pow(a,-b*x)*Math.cos(Math.abs(c*x-a)/b*Math.pow(x, 2)+c) ;
            System.out.println("res="+r);
        } else System.out.println("Не верный выбор!");
    }
    
}
