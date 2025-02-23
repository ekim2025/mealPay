import java.util.*;
public class Student{
    //fields
    private String name;
    private int id;
    private static int idGen = 1;
    private ArrayList<Transaction> transactions;
    private double balance;

    //constructor
    public Student(String myName){
        name = myName;
        balance = 0;
        id = idGen;
        idGen++;
        transactions = new ArrayList<Transaction>();
    }

    //all the fun methods oooooh

    // charge lunch: - $7 and record a transaction.
    public void chargeLunch(int monthValue, int dayValue) {
        balance -= 7; // lunch always costs $7
        transactions.add(new Transaction(monthValue, dayValue, -7, id));
    }

    public void addFunds(int monthValue, int dayValue, double amountValue) {
        balance += amountValue;
        transactions.add(new Transaction(monthValue, dayValue, amountValue, id));
    }


    //return null if no transactions on given day

    public ArrayList<Transaction> datedTransactions(int month, int day){
        ArrayList<Transaction> givenDay = new ArrayList<Transaction>();
        for(Transaction t : transactions){
            if(month == t.getMonth() && day == t.getDay()){
                givenDay.add(t);
            }
        }
        if(givenDay.size() == 0){
            return null;
        }else{
            return givenDay;
        }
        
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public double getBalance(){
        return balance;
    }


    public String toString() {
        String s = "Student: " + name + "  ID: " + id + "  Balance: $" + balance + "\nTransactions:";
        if (transactions.isEmpty()) {
            s += " None";
        } else {
            for (Transaction t : transactions) {
                s += "\n   " + t;
            }
        }
        return s;
    }

}