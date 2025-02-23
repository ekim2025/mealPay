public class Transaction {
    private int month;
    private int day;
    private double amount;
    private int studentId;

    public Transaction(int myMonth, int myDay, double myAmount, int myStudentId) {
        month = myMonth;
        day = myDay;
        amount = myAmount;
        studentId = myStudentId;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getDate() {
        return month + "/" + day;
    }

    public double getAmount() {
        return amount;
    }

    public int getStudentId() {
        return studentId;
    }

    public String toString() {
        return "(" + month + "/" + day + ", $" + amount + ") by Student ID: " + studentId;
    }
}
