import java.util.Scanner;

public class ReverseStringArrayElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        String[] array1=new String[num];
        String[] array2=new String[num];
        for (int i=0;i<num;i++){
            array1[i]=scanner.next();
        }
//        Store element in array2 in lower case

//        for(int i=0;i<num;i++){
//            array2[i]=array1[i].toLowerCase();
//            System.out.print(array2[i] + " ");
//        }
        System.out.println();
//        Store element in array2 in upper case

//        for(int i=0;i<num;i++){
//            array2[i]=array1[i].toUpperCase();
//            System.out.print(array2[i] + " ");
//        }

//        sort array element

//        bubbleSort(array1,num);
//        for (int i=0;i<num;i++){
//            System.out.print(array1[i] + " ");
//        }

//        Reverse array element
//        for (int i=num-1;i>=0;i--){
//            System.out.print(array1[i] + " ");
//        }


//        reverse array along with its letter

        for (int i=num-1;i>=0;i--){
            String reverse=reverseString(array1[i]);
            System.out.print(reverse + " ");
        }

    }
//    static void bubbleSort(String[] array, int num){
//        for(int i=0;i<num-1;i++){
//            for(int j=0;j<num-i-1;j++){
//                if(array[j].compareTo(array[j+1])>0){
//                    String temp=array[j];
//                    array[j]=array[j+1];
//                    array[j+1]=temp;
//                }
//            }
//        }
//
//    }

    static String reverseString(String word){
        char[] charArray=word.toCharArray();
        int start=0;
        int last=charArray.length-1;
        while(start < last){
            char temp=charArray[start];
            charArray[start]=charArray[last];
            charArray[last]=temp;
            start++;
            last--;
        }
        return new String(charArray);
    }

}
