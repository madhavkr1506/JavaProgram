public class Inheritance {

    static class calculation{
        private int num1;
        private int num2;
        calculation(int num1,int num2){
            this.num1=num1;
            this.num2=num2;
        }
        public int getNum1(){
            return num1;
        }
        public int getNum2(){
            return num2;
        }
    }

    static class Addition extends calculation{
        Addition(int num1,int num2){
            super(num1, num2);
            System.out.println(getNum1() + getNum2());
        }
    }
    public static void main(String[] args) {
        // calculation obj1 = new calculation(1,2);
        // System.out.println(obj1.getNum1());
        // System.out.println(obj1.getNum2());

        Addition objAddition = new Addition(2, 3);
        System.out.println(objAddition.getNum1());



    }
}