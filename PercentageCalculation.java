import java.util.Scanner;

public class PercentageCalculation {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of student you want to enter in the directory = ");
        int num=scanner.nextInt();
        scanner.nextLine();
        String[] name = new String[num];
        float[] percentage = new float[num];
        for(int i=0;i<num;i++){
            name[i]=scanner.nextLine();
            System.out.println("Enter the details of " + name[i]);
            System.out.print("Maths marks = ");
            float math=scanner.nextFloat();
            System.out.print("Science marks = ");
            float science=scanner.nextFloat();
            System.out.print("Social science marks = ");
            float socialScience=scanner.nextFloat();
            float percentageCalculation=(math + science + socialScience)/3;
            System.out.println("student " + name[i] + " has scored " + percentageCalculation);
            percentage[i]=percentageCalculation;
            scanner.nextLine();
        }
        for(int i=0;i<num;i++){
            if(percentage[i] > 90 && percentage[i] < 100.1){
                System.out.println("Congratulation "+name[i]+" ! you are awarded with grade A+.");
            }
            else if(percentage[i] > 80 && percentage[i] < 90.1){
                System.out.println("Congratulation "+name[i]+" ! you are awarded with grade A.");
            }
            else if(percentage[i] > 70 && percentage[i] < 80.1){
                System.out.println("Congratulation "+name[i]+" ! you are awarded with grade B.");
            }
            else if(percentage[i] > 60 && percentage[i] < 70.1){
                System.out.println("Congratulation "+name[i]+" ! you are awarded with grade C.");
            }
            else{
                System.out.println("Congratulation "+name[i]+" ! you are awarded Improvement course.");
            }
        }

    }
}
