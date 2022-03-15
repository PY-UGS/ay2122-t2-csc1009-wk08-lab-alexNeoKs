import java.util.Scanner;




class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super();
    }

    public InsufficientFundsException(String message) {
        super(message);
    }

}

class BankDemoTest{
    public static void check(int withdraw , int balance) throws InsufficientFundsException {
        if (withdraw > balance) throw new InsufficientFundsException("Sorry, but your account is short by:" + (withdraw - balance));
        if (withdraw < balance){
            System.out.println("The balance after withdraw is: $" + (balance - withdraw));
        }

      
    }


    public static void main(String args[]){
        CheckingAccount atm = new CheckingAccount();
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Enter deposit amount:");
        int depositamount = myscanner.nextInt();
        atm.deposit(depositamount);

        System.out.println("Enter withdraw amount:");
        int withdrawamount = myscanner.nextInt();

        int currentbalance = atm.getBalance();

        try {
            check(withdrawamount,currentbalance);
            atm.withdraw(withdrawamount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }


        myscanner.close();
    }

}