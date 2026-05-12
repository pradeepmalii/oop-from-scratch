package _03_final_keyword;

public class Main {
    public static void main(String[] args) {

        final int x = 22;
//        x = 23; these gives error bcz When a primitive variable is final:its VALUE cannot be changed after assignment.as primitive directly store actually value


        final Student s1 = new Student("Mali", 88);
        s1.name = "Pradeep";

//        s1 = new Student();  these gives error as you cannot point the reference somewhere else



    }
}


    class Student {
        String name;
        int marks;

        Student(String name, int marks){
            this.name = name;
            this.marks = marks;
        }




    }

