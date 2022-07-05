package com.main;

import com.modal.InterfaceTwo;
import com.modal.MyClassImple;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTwo interfaceTwo = new MyClassImple();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers to Add:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(interfaceTwo.add(num1, num2));
        System.out.println("Enter Two Numbers to Sub:");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println(interfaceTwo.sub(num3, num4));
    }
}