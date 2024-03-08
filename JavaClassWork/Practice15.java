

public class Practice15 {
    static class parent{
        String name;
        int regNo;
        Float cgpa;
        long mobileNo; 
        parent(String name){
            this.name = name;
        }
    }
    static class children extends parent{
        children(String name){
            super(name);
        }
        
        public void setRegNo(int regNo){
            this.regNo = regNo;
        }
        public void setCgpa(float cgpa){
            this.cgpa = cgpa;
        }
        public void setMobileNo(long mobileNo){
            this.mobileNo = mobileNo;
        }

        public String getName(){
            return name;
        }
        public int getRegNo(){
            return regNo;
        }
        public float getCgpa(){
            return cgpa;
        }
        public long getMobileNo(){
            return mobileNo;
        }


    }

    static class grandChild extends children{
        grandChild(String name){
            super(name);
            System.out.println(super.getName());
            System.out.println("This is default constructor of grandChild class.");
        }
        public void function1(){
            System.out.println(super.getRegNo());
        }
    }
    public static void main(String[] args) {
        grandChild obj2 = new grandChild("Krishna");
        obj2.setRegNo(12213356);
        obj2.function1();



    }
}
