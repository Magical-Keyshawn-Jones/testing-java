public class StudentClasses {
    String name;
    double gpa;
    int age;
    char worstGrade;


    public StudentClasses(String studentName, double currentGpa, int currentAge, char currentWorstGrade) {
        name = studentName;
        gpa = currentGpa;
        age = currentAge;
        worstGrade = currentWorstGrade;
    }
    // Void means there is no specific output

    public static void main(String[] args){
        StudentClasses kiwi = new StudentClasses("Kiwi", 3.2, 15, 'D');
        System.out.println(kiwi.name);
        System.out.println(kiwi.gpa);
        kiwi.gpa = 2.4;
        System.out.println(kiwi.gpa);
        System.out.println(kiwi);
    }
} 
