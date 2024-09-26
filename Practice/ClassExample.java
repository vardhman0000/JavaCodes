package Practice;
class Bank {
    int ca;
    int sa;

    void setBal(int a, int b){
        ca = a;
        sa = b;
    }

    void showBal(){
        System.out.println("Current Account Balance : " + ca);
        System.out.println("Savings Account Balance : " + sa);
    }

    Bank party(Bank customer){
        Bank pitaji = new Bank();
        pitaji.ca = ca + customer.ca;
        pitaji.sa = sa + customer.sa;
        return pitaji;
    }

}
class ClassExample {
    public static void main(String[] args) {
        Bank a = new Bank();
        a.setBal(10,20);
        Bank b = new Bank();
        b.setBal(20,30);

        Bank c = new Bank();
        c = a.party(b);
        c.showBal();
    }
}
