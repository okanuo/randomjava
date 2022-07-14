package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        int i = 1;
        int sum = 0;
	while(i<=10)
    {
        System.out.println("Enter #"+i+" number");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int number = scanner.nextInt();
            scanner.nextLine();
            sum+=number;
            System.out.println("The entered number is "+number);
            i++;
        }


        else{
            System.out.println("Invalid");
        }

        scanner.nextLine();



    }
        System.out.println("Total sum = "+sum);
    }
}
