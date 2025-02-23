import java.util.*;

public class Manager{
    //fields
    ArrayList<Student> students;

    public Manager(){
        students = new ArrayList<Student>();

    }

    public void addStudent(String name) { 
        students.add(new Student(name)); 
    }

    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getID() == id) return s;
        }
        return null;
    }

    public void displayNegativeBalances() {
        for (Student s : students) {
            if (s.getBalance() < 0) System.out.println(s);
        }
    }

    public String datedTransactions(int month, int day){
        String s = " ";
        for(Student st : students){
            ArrayList<Transaction> tByDay = st.datedTransactions(month, day);
            if(tByDay != null){
                s += tByDay.toString() + "by: " + st.getName() + "ID: " + st.getID();
                s += "\n";
            }
        }
        return s;
    }
    

    public void displayAllStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }
    
    public void logMeal(int month, int day, int id) {
        for (Student s : students) {
            if (s.getID() == id) {
                s.chargeLunch(month, day);
                return;
            }
        }
    }
}


