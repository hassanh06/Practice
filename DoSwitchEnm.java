package practice;

import java.util.Scanner;

public class DoSwitchEnm {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter case #");
        int day=in.nextInt();


    String weekDays;
    switch (day) {
        case 1:
            weekDays = "Sunday";
            System.out.println(weekDays);
            break;
        case 2:
            weekDays = "Monday";
            System.out.println(weekDays);
            break;
        case 3:
            weekDays = "Tuesday";
            System.out.println(weekDays);
            break;
        case 4:
            weekDays = "Wednesday";
            System.out.println(weekDays);
            break;
        case 5:
            weekDays = "Thursday";
            System.out.println(weekDays);
            break;
        case 6:
            weekDays = "Friday";
            System.out.println(weekDays);
            break;
        case 7:
            weekDays = "Saturday";
            System.out.println(weekDays);
            break;
        default:
            System.out.println("Vacation");

    }

    }

}


