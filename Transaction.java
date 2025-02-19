public class Transaction{
    private int month;
    private int day;
    private double amount;
    private int studentId;

    public Transaction(int month, int day, double amount) {
        month = month;
        day = day;
        amount = amount;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public String getDate(){
        return month + "/" + day;
    }

    public double getAmount(){
        return amount;
    }


    public String toString(){
        return "(" + month + "/" + day + ", $" + amount + ") by Student ID: " + studentId;
    }

}