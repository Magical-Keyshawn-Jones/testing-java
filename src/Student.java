public class Student {
    String name;
    double gpa;
    int age;
    char worstGrade;


    public Student(String studentName, double currentGpa, int currentAge, char currentWorstGrade) {
        name = studentName;
        gpa = currentGpa;
        age = currentAge;
        worstGrade = currentWorstGrade;
    }

    public static void main(String[] args){
        Student kiwi = new Student("Kiwi", 3.2, 15, 'D');
        System.out.println(kiwi.name);
        System.out.println(kiwi.gpa);
    }
} 
