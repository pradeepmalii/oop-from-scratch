package _01_classes_and_objects;

public class ClassNObject {
    public static void main(String[] args) {
        //store 5 roll no.
        int[] rollNo = new int[5];

        //store 5 names
        String[] names = new String[5];

        //store data of 5 students include marks, roll no., name
        // data of 5 students: {rollNo, name, marks}
        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

//        Student[] students = new Student[5];

        //jst declaring
        Student student1; //this is basically the reference to an object of type Student , this is not creating the object and as the object is not yest created it is actually pointing to null
        //now initializing
        student1 = new Student();

        student1.roll = 42;
        student1.name = "Pradeep";
        student1.marks = 80;

        System.out.println(student1.roll);
        System.out.println(student1.name);
        System.out.println(student1.marks);
    }
}



