package gamedemo;

public class GameTest{
  public static void main(String[] args){
   BankAccount a1 = new BankAccount("Tim's Gold",1000);
   BankAccount a2 = new BankAccount("William's Gold");
   a2.deposit(250);
   // a1.balance = 1000000;

   System.out.println("a1="+a1);
   System.out.println("a2="+a2);

   // deposit 10000 into a1
   a1.deposit(10000);
   // withdraw 50 from a2
   a2.withdraw(50);
   // transfer 100 from a1 to a2
   a1.transferTo(100,a2);

   // printout the balance from a1 and a2
   System.out.println("Tim has "+a1.getBalance()+" gold pieces");
   System.out.println("Will has "+a2.getBalance()+" gold pieces");
   System.out.println("Tim has "+a1.getTransactions()+" transactions");
   System.out.println("Will has "+a2.getTransactions()+" transactions");
   System.out.println("Bank has "+BankAccount.getAllTransactions()+" transactions");

  }
}