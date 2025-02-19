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


    public void chargeLunch(int month, int day){
        balance -= 7; //hard code for lunch amount
        Transaction t = new Transaction(month, day, -7);
        transactions.add(t);
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









    public String toString(){
        return "Name: " + name + "ID: " + id + "Balance: " + balance + "Transactions: " + transactions;
    }
    

}