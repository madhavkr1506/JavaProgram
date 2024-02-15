public class Array27 {
  // public static int secondPosition(String string,char target){
  //   int firstposition = string.indexOf(target);
  //   if(firstposition != -1){
  //     int secondposition = string.indexOf(target, firstposition + 1);
  //     return secondposition;
  //   }
  //   return -1;
    
  // }
  public static void main(String[] args) {
      String string = "Madhav";
      int n = string.length();
      char target = 'a';
      // System.out.println(secondPosition(string, target));

      int firstpart = -1;
      for(int i=0;i<n;i++){
        if(string.charAt(i) == target){
          firstpart = i;
          break;
        }
      }

      
      if(firstpart != -1){
        string = string.substring(firstpart + 1);
        int m = string.length();
        int secondpart = -1;
        for(int i=0;i<m;i++){
          if(string.charAt(i) == target){
            secondpart = i;
            System.out.println(secondpart+=firstpart + 1);
            break;
          }
        }
      }
      else{
        System.out.println(target+" is not present in the string");
      }
      
      
    }
}




































/*
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 * 
 * https://www.geeksforgeeks.org/wrapper-classes-java/
 * 
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 * 
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 * 
 * https://www.geeksforgeeks.org/divide-and-conquer/
 * 
 * https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 * 
 * 
 * 
 */


 /*
  * import java.util.*;

public class Main {
  public static int countwords(String str){
     if(str.length()==0) return 0;
     int count=1;                        //lets do java
     for(int i=0;i<str.length();i++){    //my code is running
         if(str.charAt(i)==' ') count++;
     }
     return count;
  }
  public static String reversestringwordwise(String str){
    
           String output="";             
           int j=str.length(); //20       i    j
     for(int i=str.length()-1;i>=0;i--){    //my code is running
        
        if(str.charAt(i)==' ') {
          output+=str.substring(i+1,j) + " "; 
          j=i;
        }
     }
     output+=str.substring(0,j);
     return output;
  }
   public static String reversestring(String str){
       String output="";
     for(int i=str.length()-1;i>=0;i--){    //my code is running
          output=output+str.charAt(i);
     }
         
         
         
         return output;
    
  }
  // public static void reversestringwordwise(String str){
    
  //       String output[]=str.split(" ");
  //       Collections.reverse(Arrays.asList(output));
  //       System.out.println(String.join(" ",output)); //n^2 
    
  // }
  
    public static void main(String[] args) { 
      
      
      //wrapper classes in java
       int a=20;
       Integer c=Integer.valueOf(a);
       Integer b=a; //autoboxing
       Integer  d=2000;
       int e=d; //unboxing
        System.out.print( e + " ");
        System.out.println(d );
    //   Integer a=126;
    // Integer  b=126;
    // for(int i=1;i<=4;i++){
    //     System.out.print("value of a = " + a);
    //   System.out.println(    a==b); 
    //       a++;b++;
    // }
      
      
      
      // int a=Integer.MAX_VALUE;
      // int b=Integer.MIN_VALUE;
      
      // Scanner sc=new Scanner(System.in);
      // String str=sc.nextLine();
      // int totalwords=countwords(str);
      // System.out.println(totalwords);
      // String reversed=reversestring(str);
      // System.out.println(reversed);
  //  System.out.println( a + " " +  b);
    //   String str="abc";
    //   String str2="abc";
    //   String str3=new String("abc");
    // //  System.out.println(str.equals(str2));
    //   System.out.println(str==str2);
    //   System.out.println(str==str3);
  }
}
  */
