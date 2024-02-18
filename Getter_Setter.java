// write a program for understanding getter and setter : 

public class Getter_Setter {
    static class getter_setter{
        private int id;
        private String first_name;
        private String last_name;
        private char grade;

        getter_setter(int id,String first_name,String last_name,char grade){
            this.id = id;
            this.first_name = first_name;
            this.last_name = last_name;
            this.grade = grade;
        }

        public void setId(int id){
            this.id = id;
        }
        public int getId(int id){
            return id;
        }

        public void setFirstName(String firstName){
            this.first_name = firstName;
        }
        public String getFirstName(String firstName){
            return firstName;
            
        }

        public void setLastName(String lastName){
            this.last_name = lastName;
        }
        public String getLastName(String lastName){
            return lastName;
        }

        public void setGrade(char grade){
            this.grade = grade;
        }
        public char getGrade(char grade){
            return grade;
        }

        public String toString(){
            return "Details : [ Id = "+id+", First Name = "+first_name+", Last Name = "+last_name+", Grade"+grade+"]";
        }
    }

    
    public static void main(String[] args) {
        getter_setter obj1 = new getter_setter(12213356, "Madhav", "Kumar", 'A');
        System.out.println(obj1);
        obj1.setFirstName("Krishna");
        System.out.println(obj1);
    }
}
