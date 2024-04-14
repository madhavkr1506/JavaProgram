import java.util.*;
import java.io.*;

public class file8 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your file name : ");
        String str1 = sc.nextLine();
        File file = new File(str1);
        if(file.exists()){
            System.out.println("File exists");
        }
        else{
            System.out.println("Create a file");
            return;
        }

        ArrayList<Integer> array = new ArrayList<>();

        try{
            System.out.println("Reading your file");
            FileReader read = new FileReader(file);

            BufferedReader br = new BufferedReader(read);
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.split("\\s+");
                for(String word : words){
                    array.add(Integer.parseInt(word));
                }


            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Printing Arraylist : ");
        System.err.println(array);
        System.out.println("Maximum array element : ");
        System.out.println(Collections.max(array));
        System.out.println("Minimum array element : ");
        System.out.println(Collections.min(array));

        double sum = 0;
        for(int i=0;i<array.size();i++){
            sum += array.get(i);
        }

        System.out.println("Average : ");
        System.out.println(Math.round(sum/array.size()));
        
        sc.close();
    }
}
