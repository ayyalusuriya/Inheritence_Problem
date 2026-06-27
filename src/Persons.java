public class Persons {
    String name;
    void displayname(){
        System.out.println(name);
    }
    static class Employee extends Persons{
        int salary;
        void displaysal(){
            System.out.println(salary);
        }

        static class Department extends Employee{
            String dept;
            void displaydept(){
                System.out.println(dept);
            }
        }


      public static void main(String[] args) {
            Department d = new Department();
            d.name = "Ayyalu";
            d.salary = 12000;
            d.dept = "IT";

            d.displayname();
            d.displaysal();
            d.displaydept();


      }
    }
}
