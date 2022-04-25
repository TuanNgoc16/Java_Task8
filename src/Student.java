public class Student {

        int RollNo;
        String name;
        ClassRoom myClass;
        public Student (int RollNo, String name){
            this.name = name;
            this.RollNo= RollNo;
        }
        public Student ( int RollNo, String name, ClassRoom myClass){
            this.RollNo=RollNo;
            this.name= name;
            this.myClass = new ClassRoom();

        }
        public String toString (){
            return "RollNo " + RollNo + ";" + "Name " + name + "; MyClass: " +  myClass;

        }
         public static void main(String[] args) {
            Student a = new Student(1, "Tuan ngoc",new ClassRoom(1,"t12"));
            System.out.println(a);
        }
    }
