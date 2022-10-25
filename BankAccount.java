import java.util.HashMap;
import java.util.Scanner;

public class BankAccount {
    private int id;
    private double balance = 0;
    private static double interestRate = 0.15;
    private static int count = 0;

    public BankAccount() {
        this.id = ++count;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public double calcInterest(int months){
        return this.balance * BankAccount.interestRate * months / 12;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, BankAccount> accounts = new HashMap<>();
        while (true){
            String command = scanner.nextLine();
            String[] cmdPart = command.split(" ");
            if(cmdPart[0].equals("end")){
                System.out.println("Goodbye");
                break;
            }

            else if(cmdPart[0].equals("create")){
                BankAccount acc = new BankAccount();
                accounts.put(acc.id, acc);
                System.out.printf("Account #%d created\n",acc.id);
            }
            else if(cmdPart[0].equals("deposit")){
                int accId = Integer.parseInt(cmdPart[1]);
                BankAccount acc = accounts.get(accId);
                if(acc != null) {
                    double depositValue = Double.parseDouble(cmdPart[2]);
                    acc.deposit(depositValue);
                    System.out.printf("Deposited %.2f to account #%d\n", depositValue, acc.id);
                }
                else {
                    System.out.printf("Account #%d not found\n",accId);
                }
            }
            else if(cmdPart[0].equals("calc-interest")){
                int accId = Integer.parseInt(cmdPart[1]);
                BankAccount acc = accounts.get(accId);
                if(acc != null) {
                    int months = Integer.parseInt(cmdPart[2]);
                    double rate = acc.calcInterest(months);
                    System.out.printf("Interest: %.2f\n", rate);
                }
                else {
                    System.out.printf("Account #%d not found\n",accId);
                }
            }
            else if(cmdPart[0].equals("set-interest")){
                double rate = Double.parseDouble(cmdPart[1]);
                BankAccount.setInterestRate(rate);
                System.out.printf("Interest rate changed: %.2f\n",rate);

            }
            else {
                System.out.println("Invalid command: " + command);
            }
        }

    }
}
