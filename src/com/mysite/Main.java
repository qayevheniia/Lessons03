package com.mysite;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in= new Scanner(System.in);

        //System.out.println("Please, enter your age and press Enter");
        // int number= in.nextInt();
        // int age = 18;
        //
        // if (number > age) {
        //     System.out.println("Welcome");
        // } else if (number == age) {
        //     System.out.println("Sorry, wait a bit");
        // } else {
        //     System.out.println("Sorry, denied");
        // }
        //
        // int target_age=20;
        //
        // String result = (age >= target_age) ? "Welcome": "Sorry, denied";
        // System.out.println(result);



//        System.out.println("Please, enter time: ");
//        int time = in.nextInt();
//        if (time>18)
//        {
//            System.out.println("Good evening");
//        }
//        else if (time<10){
//            System.out.println("Good morning");
//        }
//        else {
//            System.out.println("Otherwise Good day");
//       }
//
//        String result = (time>18) ? "Good evening" : "Otherwise Good day";
//        System.out.println(result);
//
//
//        System.out.println("Please, enter number of week day ");
//        int number_week = in.nextInt();
//
//        switch(number_week){
//            case 1: System.out.println("Monday");
//            break;
//            case 2: System.out.println("Tuesday");
//            break;
//            case 3: System.out.println("Wednesday");
//            break;
//            case 4: System.out.println("Thursday");
//            break;
//            case 5: System.out.println("Friday");
//            break;
//            case 6: System.out.println("Saturday");
//            break;
//            case 7: System.out.println("Sunday");
//            break;
//            }

        System.out.println("Please, enter length ");
        int length = in.nextInt();

        System.out.println("Please, enter any word ");

        String word = in.nextLine();

        if ( word.length() > length)
        {
            System.out.println("Error");
        }

        System.out.println("Please, enter your name ");
        String name = in.nextLine();
        System.out.println("Please, enter your password ");
        String password = in.nextLine();
        String def_name = "Yuriy";
        String def_password = "pass";

        if ((name.equals(def_name)) &&  (password.equals(def_password)))
        {
            System.out.println("Entered");
          }
        else {
            System.out.println("Error");
        }


    }
    }

