class Account {
    int balance = 100;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient funds");
        }
    }
}

class Customer implements Runnable {
    Account acc;
    int amount;

    Customer(Account acc, int amount) {
        this.acc = acc;
        this.amount = amount;
    }

    public void run() {
        acc.withdraw(amount);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc = new Account();
        Thread t1 = new Thread(new Customer(acc, 70), "A");
        Thread t2 = new Thread(new Customer(acc, 50), "B");
        t1.start();
        t2.start();
    }
}
