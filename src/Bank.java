public class Bank {

    void interestrate(){
        System.out.println("Interest: 5%");;
    }



    static class SBI extends Bank{

        @Override
        void interestrate() {
            super.interestrate();
            System.out.println("Interest: 7%");

        }
    }

    public static void main(String[] args) {
        SBI s  = new SBI();

        s.interestrate();


    }
}

// practice program for method overriding