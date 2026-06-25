import java.util.Scanner;

public class Person {

    String name;
    int age;

    void setaperson(String name , int age){
        this. name  =name;
        this.age = age;
    }
    void displayPerson(){
        System.out.println(name);
        System.out.println(age);;
    }

    static class Student extends Person{
        int rollno;

        void setStudent(int rollno) {
            this.rollno = rollno;
        }
        void displayStudent(){
            System.out.println(rollno);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Enter the rollNo: ");
        int rollno = sc.nextInt();

        Student s = new Student();

        s.setaperson(name , age);
        s.setStudent(rollno);


        s.displayPerson();
        s.displayStudent();
    }
}
