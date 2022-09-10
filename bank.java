class SavingsAccount{
    double intrestRate = 4.0;
    private double balance;
    SavingsAccount(double b){
        balance = b;
    }
    void setInstrestRate(double newInstrest){
        intrestRate = newInstrest;
    }
    double getMonthlyIntrest(){
        double mi = (intrestRate*balance)/12;
        return mi;
    }
}

public class bank {
    public static void main(String[] args) {
    SavingsAccount saver1 = new SavingsAccount(2000);
    SavingsAccount saver2 = new SavingsAccount(3000);
    System.out.println("Monthly Instrest of saver1 : "+ saver1.getMonthlyIntrest());
    System.out.println("Monthly Intrest of saver 2 : "+ saver2.getMonthlyIntrest());
    saver1.setInstrestRate(4);
    saver2.setInstrestRate(5);
    System.out.println("Monthly intrest of saver 1 after change : "+ saver1.getMonthlyIntrest());
    System.out.println("monthly intrest of saver 2 after change : "+ saver2.getMonthlyIntrest());
}
}