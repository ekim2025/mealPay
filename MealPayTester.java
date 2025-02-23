public class MealPayTester {
    public static void main(String[] args){
        Manager manager = new Manager();

        System.out.println("Welcome to the MealPay program!");

        System.out.println("\nAdding students to the program...");
        manager.addStudent("Fina Fofana");
        manager.addStudent("Joe Schmo");
        manager.addStudent("Evelyn Kim");
        manager.addStudent("Schmoozy Doozy");

        System.out.println("\nDisplaying students...");
        manager.displayAllStudents();

        System.out.println("\nAdding some funds and making some purchases...");
        Student student1 = manager.findStudent(1);
        Student student2 = manager.findStudent(2);
        Student student3 = manager.findStudent(3);
        Student student4 = manager.findStudent(4);

        if (student1 != null) {
            student1.chargeLunch(2, 4);
            student1.chargeLunch(2, 6);
        }

        if (student2 != null) {
            student2.addFunds(2, 4, 40);
            student2.chargeLunch(2, 5);
        }

        if (student3 != null) {
            for (int i = 0; i < 6; i++) {
                student3.chargeLunch(2, 4);
            }
            student3.chargeLunch(2, 8);
            student3.chargeLunch(2, 8);
        }

        if (student4 != null) {
            student4.addFunds(2, 9, 5);
            student4.addFunds(2, 9, 5);
        }

        System.out.println("\nDisplaying students...");
        manager.displayAllStudents();

        System.out.println("\nDisplaying just those with negative balances...");
        manager.displayNegativeBalances();

        System.out.println("\nLooking up student with ID number 2:");
        System.out.println(manager.findStudent(2));

        System.out.println("\nDisplaying all transactions on 2/4...");
        manager.datedTransactions(2, 4);
    }
}
