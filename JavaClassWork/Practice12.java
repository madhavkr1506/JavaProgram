public class Practice12 {
    public static void main(String[] args) {
        // Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.


        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 

        int result  = str1.compareTo(str2);

        if(result < 0){
            System.out.println(str1+" is smaller than " + str2);
        }
        else if(result == 0){
            System.out.println(str1+" is equal to "+str2);
        }
        else{
            System.out.println(str1+" is greater than "+str2);
        }

        
    }
}
/*
 * https://www.geeksforgeeks.org/encapsulation-in-java/
 * https://www.geeksforgeeks.org/interfaces-in-java/
 * https://youtube.com/shorts/CNGAM-IIG38?si=vuyC24P0iNdcek18
 * https://youtube.com/shorts/V7jdfyKuajQ?si=7FNB0t6YuB2Nd1Wf
 * https://www.geeksforgeeks.org/object-class-in-java/
 * manitsaharan27@gmail.com
 * 
 */