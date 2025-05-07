class Employee extends Person{
    int salary, emp_id;
    Employee(int salary, int emp_id, int age, String name) {
        super(age, name);
        this.salary = salary;
        this.emp_id = emp_id;
    }

    void display(){
        super.display();
        System.out.println("Employee ID: " + emp_id + ", Salary: " + salary);
    }
}

public class Person {
    int age;
    String name;
    
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Person person1 = new Person(25, "Alice");
        // person1.display();

        Employee employee1 = new Employee(50000, 101, 30, "Bharat");   
        employee1.display();
    }
}
