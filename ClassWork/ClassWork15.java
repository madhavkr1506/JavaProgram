package ClassWork;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class ClassWork15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int num = scanner.nextByte();

//        Write a program to check whether num is even or odd :
//        String result = (num % 2 == 0) ? "It is an even number" : "It is not an even number";
//        System.out.println(result);

//        Write a program to check whether num is a positive number :
//        boolean positive = (num > 0) ? true : false;
//        System.out.println(positive);

//        Write a program for switch case :
//        int input = scanner.nextInt();
//        switch(input){
//            case 1 :
//                System.out.println("Monday");
//                break;
//            case 2 :
//                System.out.println("Tuesday");
//                break;
//            case 3 :
//                System.out.println("Wednesday");
//                break;
//            case 4 :
//                System.out.println("Thursday");
//                break;
//            case 5 :
//                System.out.println("Friday");
//                break;
//            case 6 :
//                System.out.println("Saturday");
//                break;
//            case 7 :
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Go back Simon : 1927");
//        }

        ArrayList <String> months = new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("Aug");
        months.add("Sept");
        months.add("Oct");
        months.add("Nov");
        months.add("Dec");

        ArrayList <String> weekDay = new ArrayList<>();
        weekDay.add("Mon");
        weekDay.add("Tue");
        weekDay.add("Wed");
        weekDay.add("Thr");
        weekDay.add("Fri");
        weekDay.add("Sat");
        weekDay.add("Sat");


        int input2 = scanner.nextInt();
        switch(input2){
            case 1 :
                for(String string : months){
                    System.out.print(string + " ");
                }
                break;
            case 2 :
                for(String day : weekDay){
                    System.out.print(day + " ");
                }
                break;
            default:
                System.out.println("Go back Simon : 1927");
        }

//        Create an array of arraylists of type integer with a size of four :
        ArrayList<Integer> [] Array = new ArrayList[4];
//        Now, Initialize each arraylist in the array :
        for(int i=0;i<4;i++){
            Array[i] = new ArrayList<>();
        }

//        Adding elements to the Arraylist at index 0 :
        Array[0].add(1);
        Array[0].add(2);
        Array[0].add(3);
        Array[0].add(4);

//        Printing all the elements of the arraylist at index 0 :
        for(int i=0;i<Array[0].size();i++){
            System.out.print(Array[0].get(i)+" ");
        }

    }
}
