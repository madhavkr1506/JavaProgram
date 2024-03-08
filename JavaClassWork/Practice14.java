public class Practice14 {
    static class parent{
        private String name;
        private int regNo;
        protected float cgpa;
        protected long mobileNo;
        public void setName(String name){
            this.name = name;
        }
        public void setRegNo(int regNo){
            this.regNo = regNo;
        }
        public String getName(){
            return name;
        }
        public int getRegNo(){
            return regNo;
        }
    }
    static class children extends parent{
        public void setCgpa(float cgpa){
            this.cgpa = cgpa;
        }
        public void setMobile(long mobileNo){
            this.mobileNo = mobileNo;
        }
        public float getCgpa(){
            return cgpa;
        }
        public long getMobile(){
            return mobileNo;
        }
    }
    public static void main(String[] args) {
        parent obj1 = new parent();
        obj1.setName("Madhav Kumar");
        obj1.setRegNo(12213356);

        children obj2 = new children();
        obj2.setCgpa(9.8f);
        obj2.setMobile(9693744950L);
        

        // System.out.println(obj2.getName()); // --> It will throw null.
        System.out.println(obj1.getName());
        System.out.println(obj1.getRegNo());
        System.out.println(obj2.getCgpa());
        System.out.println(obj2.getMobile());
    }
}
