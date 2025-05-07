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
        Person person1 = new Person(25, "Alice");

        person1.display();
    }
}
