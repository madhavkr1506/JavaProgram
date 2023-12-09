import java.util.Scanner;
public class FloatSumArray {
    public static void main(String[] args) {
        float[] array1 = {100.1f,100.6f,100.7f,100.9f,100.6f,100.7f};
        float sum=0;
        float num=100.9f;
        for(int i=0;i<array1.length;i++){
            sum+=array1[i];
        }
        System.out.println(sum);

//        for(float element : array1){
//            if(element==num){
//                System.out.println("yes found " + element);
//            }
//        }


        
        boolean found=false;
        for(int i=0;i<array1.length;i++){
            if(array1[i]==num){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("yes found");
        }
        else{
            System.out.println("not found");
        }
    }
}
