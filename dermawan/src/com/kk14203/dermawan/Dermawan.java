/*
 * Name:        Dermawan.java
 * Copyright:   (c) 2016 Azrin Aziz <azrinaziz@gmail.com>
 * Limitations: For educational purposes only. Any unauthorised copying of any
 *              part of this source code without the authors' explicit
 *              permission is strictly prohibited.
 */

package com.kk14203.dermawan;

import java.util.Scanner;

final public class Dermawan {

    private void execute()//used to output details about the program
        {
            System.out.println("Dermawan");
            System.out.println("KK14203");
            System.out.println("This program stores list of donors and also enable user to view, delete and edit donor details");
        }


    private void menu()//provides menu for users to choose from
        {
            System.out.println("(1) - Add donor");
            System.out.println("(2) - Delete donor");
            System.out.println("(3) - Edit donor");
            System.out.println("(4) - View Donor");
            System.out.println("Please enter between 1 - 4. Enter 0 to exit");
            System.out.println();
        }




    public static void main(String[] args) {

        Dermawan dermawan = new Dermawan();
        dermawan.execute();
        int input;
        Scanner reader = new Scanner(System.in); //used to get input from user


        do {
            dermawan.menu();
            input = reader.nextInt();//reads the input as an int and put it into input variable
        }while(input!=0);
    }


}