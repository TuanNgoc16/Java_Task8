public class ClassRoom {

        int ClassID;
        String ClassName;
        public ClassRoom (){
            ClassID = 21;
            ClassName = " T2109A";

        }
        public ClassRoom (int id ,  String name){
            ClassID = id;
            ClassName = name;
        }
        public String toString () {
            return "ClassID" + ":" + ClassID + "," + "ClassName" + ":" + ClassName;}

            public static void main (String[]args){
            ClassRoom b = new ClassRoom( 1, "AD2109a");
            System.out.println(b);


        }
    }

