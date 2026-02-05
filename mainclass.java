

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Constructor is called: Student object created!");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class mainclass {
    public static void main(String[] args) {
        Student s1 = new Student("anushka", 19);
        s1.display();
    }
}