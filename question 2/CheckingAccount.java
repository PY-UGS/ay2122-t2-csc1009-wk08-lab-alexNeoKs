

class CheckingAccount{
    int balance;
    int account_num;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public int getBalance(){
        return this.balance;
    }

    public int getNumber(){
        return this.account_num;
    }

}