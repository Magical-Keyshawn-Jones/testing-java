public class StudentMethods {
    String name;
    int age;
    double gpa;
    boolean isDumb;
    char lowestGrade;

    public StudentMethods(String studentName, int studentAge, double studentGpa, boolean studentIsDumb, char studentLowestGrade) {
        name = studentName;
        age = studentAge;
        gpa = studentGpa;
        isDumb = studentIsDumb;
        lowestGrade = studentLowestGrade;
    }

    // Public - others classes can use it
    // Void - no specific output
    public void roleCall() {
        System.out.println("Here!");
    }

    public void changeGrade(char badGrade) {
        lowestGrade = badGrade;
        System.out.println("Lowest grade updated");
    }

    public static void main(String[] args) {
        StudentMethods student1 = new StudentMethods("Kiwi", 15, 3.1, false, 'C');
        System.out.println(student1.name);
        System.out.println(student1.lowestGrade);
        student1.roleCall();
        student1.changeGrade('A');
        System.out.println(student1.lowestGrade);
    }
}
