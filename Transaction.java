public class Transaction{
    private String date;
    private double amount;
    private int studentId;

    public Transaction(String date, double amount, int studentId) {
        date = date;
        amount = amount;
        studentId = studentId;
    }

    public String getDate(){
        return date;
    }

    public double getAmount(){
        return amount;
    }

    public int getStudentId() {
        return studentId;
    }

}