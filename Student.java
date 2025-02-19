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
    }







    public String toString(){
        return "Name: " + name + "ID: " + id + "Balance: " + balance + "Transactions: " + transactions;
    }
    

}