public class StudentMethods {
    // Instances
    String name;
    int age;
    double gpa;
    boolean isDumb;
    char lowestGrade;
    double money;

    // Constructor
    public StudentMethods(String studentName, int studentAge, double studentGpa, boolean studentIsDumb, char studentLowestGrade, double studentMoney) {
        name = studentName;
        age = studentAge;
        gpa = studentGpa;
        isDumb = studentIsDumb;
        lowestGrade = studentLowestGrade;
        money = studentMoney;
    }

    // Public - others classes can use it
    // Void - no specific output/ does not return anything
    // Methods
    public void roleCall() {
        System.out.println("Here!");
    }

    public void changeGrade(char badGrade) {
        lowestGrade = badGrade;
        System.out.println("Lowest grade updated"); 
    }

    public String lastName(String studentLastName) {
        return studentLastName;
    }

    public String addLastName(String studentLastName) {
        name = name+ " " +studentLastName;
        System.out.println(name);
        return name;
    }

    public void bankAccount() {
        System.out.println(money);
    }

    public String withdraw(double withdraw) {
        money -= withdraw;
        String message = "Your purchase amount of " +withdraw+ " has left your current balance to be " +money;
        return message;
    }

    public static void main(String[] args) {
        StudentMethods student1 = new StudentMethods("Kiwi", 15, 3.1, false, 'C', 3.42);
        System.out.println(student1.name);
        student1.addLastName(student1.lastName("Pandora"));
        student1.withdraw(154.32);
        System.out.println(student1.withdraw(154.32));
        // System.out.println(student1.lowestGrade);
        // student1.roleCall();
        // student1.changeGrade('A');
        // System.out.println(student1.lowestGrade);
    }
}
