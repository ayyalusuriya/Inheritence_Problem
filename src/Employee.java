public class Employee {

    void work(){
        System.out.println("Employee is working...");
    }


    static class Developer extends Employee{

        void work(){
            System.out.println("Developer helps to code..");
            super.work();
        }
    }
    public static void main(String[] args) {

            Developer d = new Developer();
            d.work();
    }
}
