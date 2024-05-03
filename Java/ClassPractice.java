public class ClassPractice {
    // class outer1{
    //     static class inner1{
    //         public void printHello(){
    //             System.out.println("Hello");
    //         }
    //     }
    // }


    class outer2{
        class inner2{
            public void printHello(){
                System.out.println("Hello");
            }
        }
    }
    public static void main(String[] args) {
        // outer1.inner1 inner1Obj = new outer1.inner1();
        // inner1Obj.printHello();

        ClassPractice mainobj = new ClassPractice();
        ClassPractice.outer2 outer2Obj = mainobj.new outer2();
        ClassPractice.outer2.inner2 inner2Obj = outer2Obj.new inner2();
        inner2Obj.printHello();

        
    }
}
