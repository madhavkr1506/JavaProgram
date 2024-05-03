import java.io.IOException;
import java.io.StringReader;

public class StringPractice {
    public static void main(String[] args) {
        String[] string = {"MAdhav","Rahul","KUmAr","SinGH"};
        int sum = 0;

        int vowelCount = 0;
        for(int i=0;i<string.length;i++){
            String temp = string[i].toLowerCase();
            try{
                StringReader read = new StringReader(temp);
                int j;

                while((j = read.read()) != -1){
                    char ch = (char)j;
                    if("aeiou".indexOf(ch) != -1){
                        vowelCount++;
                        sum+=vowelCount;
                        vowelCount = 0;
                    }
                }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println(sum);
    }
}
