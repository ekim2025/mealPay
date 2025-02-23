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


        

    }
}
