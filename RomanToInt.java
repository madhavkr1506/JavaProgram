public class RomanToInt {
    public static int convertCharToInt(char c){
        if(c == 'I'){
            return 1;
        }
        if(c == 'V'){
            return 5;
        }
        if(c == 'X'){
            return 10;
        }
        if(c == 'L'){
            return 50;
        }
        if(c == 'C'){
            return 100;
        }
        if(c == 'D'){
            return 500;
        }
        if(c == 'M'){
            return 1000;
        }
        return -1;
    }

    public static int romaninteger(String s){
        int total = 0;
        for(int i = 0;i < s.length();i++){
            int value1 = convertCharToInt(s.charAt(i));
            if((i + 1) < s.length()){
                int value2 = convertCharToInt(s.charAt(i + 1));
                if(value1 >= value2){
                    total += value1;
                }
                else{
                    total -= value1;
                }
            }
            else{
                total += value1;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String str1 = "LXVMC";
        
        System.out.println(romaninteger(str1));
    }
}
