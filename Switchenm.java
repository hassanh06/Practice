package practice;

import java.util.Scanner;

public enum Switchenm {
SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

    public static void dayInfo(){

            Scanner in = new Scanner(System.in);
            System.out.println("Enter day # : ");
            int day = in.nextInt();



            switch (day) {
                case 1:

                    System.out.println(Switchenm.SUNDAY);
                    break;
                case 2:

                    System.out.println(Switchenm.MONDAY);
                    break;
                case 3:

                    System.out.println(Switchenm.TUESDAY);
                    break;
                case 4:

                    System.out.println(Switchenm.WEDNESDAY);
                    break;
                case 5:

                    System.out.println(Switchenm.THURSDAY);
                    break;
                case 6:

                    System.out.println(Switchenm.FRIDAY);
                    break;
                case 7:

                    System.out.println(Switchenm.SATURDAY);
                    break;
                default:
                    System.out.println("Vacation");

            }
        }

    public static void main(String[] args) {
        dayInfo();

    }


}




