package OOPs;

public class Main {
    public static void main(String[] args) {
        Student s1  = new Student();
        Student s2  = new Student();
        Student s3 = new Student("Vardhman", 2200);
        s1.name = "Vardhman Jain";
        s1.marks = 100;
        s1.rollno = 2513;

        s2.name = "Someone";
        s2.marks = 50;
        s2.rollno = 9877;

        System.out.println(s1);
        System.out.println(s1.name + " " + s1.rollno);
        System.out.println(s2.name + " " + s2.rollno);
        System.out.println(s3.name + " " + s3.rollno);
    }
}
