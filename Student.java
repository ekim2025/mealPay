import java.util.*;
public class Student{

    private String name;
    private int id;
    private static int idGen = 1;
    private ArrayList<Transaction> transactions;
    private double balance;







    public String toString(){
        return "Name: " + name + "ID: " + id + "Balance: " + balance + "Transactions: " + transactions;
    }
    

}