package HW5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;

    public Employee (String name, String position, String email, long phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo () {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Оклад: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }

}
