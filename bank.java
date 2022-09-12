//created a class named SavingsAccount to calculate the users monthly intreset and balance
class SavingsAccount{
    private double intrestRate = 0.0,mi;
    private double balance;
    SavingsAccount(double b){
        balance = b;
    }
    //this method sets the intreset rate
    void setInstrestRate(double newInstrest){
        this.intrestRate = newInstrest;
    }
    //this method is to get monthly intreset
    double getMonthlyIntrest(){
        this.mi = (this.intrestRate*this.balance)/12;
        return this.mi;
    }
    //this method is to get balance
    double getBalance(){
        this.balance = this.balance+mi;
        return this.balance;
    }
}

public class bank {
    public static void main(String[] args) {
    //creating two objects with saver1, saver2 with 2000 and 3000 as bank balance as respectivly
    SavingsAccount saver1 = new SavingsAccount(2000);
    SavingsAccount saver2 = new SavingsAccount(3000);
    saver1.setInstrestRate(4.0);
    saver2.setInstrestRate(5.0);
    //printing the final verdict
    System.out.println("Saver1 monthly intreset : "+saver1.getMonthlyIntrest());
    System.out.println("saver1 balance : "+saver1.getBalance());
    System.out.println("saver2 monthly intreset : "+saver2.getMonthlyIntrest());
    System.out.println("saver2 balance : "+saver2.getBalance());

}
}
