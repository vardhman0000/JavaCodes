package OOPs;

public class StudentGrades {

    static class Student {
        private String name ;
        private int rollNo;
        private double marks;

        Student(String name, int rollNo, double marks){
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        public void setName(String name){
            this.name = name ;
        }
        public String getName(){
            return name;
        }

        public void setRollNo(int rollNo){
            this.rollNo = rollNo;
        }
        public int getRollNo(){
            return rollNo;
        }

        public void setMarks(double marks){
            this.marks = marks;
        }
        public double getMarks(){
            return marks;
        }

        public void showDetails(){
            System.out.println("Name : " + name);
            System.out.println("Roll No : " + rollNo);
            System.out.println("Marks : " + marks);
            calculateGrade();

        }

        public void calculateGrade(){
            if(marks >= 90){
                System.out.println("Grade : A");
            }
            else if(marks >= 80 && marks <= 89){
                System.out.println("Grade : B");
            }
            else if(marks >= 70 && marks <= 79){
                System.out.println("Grade : C");
            }
            else if(marks >= 60 && marks <= 69){
                System.out.println("Grade : D");
            }
            else{
                System.out.println("FAIL!!");
            }
        }

    }

    public static void main(String[] args) {
        Student s1 = new Student("Vardhman Jain", 2513, 100);
        s1.showDetails();
//        s1.calculateGrade();

    }

}
