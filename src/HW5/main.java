package HW5;

public class main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Захар", "Менеджер", "zz@aa.ru", 892346737, 10000, 23);
        Employee employee2 = new Employee("Мария", "Логист", "fkjh@aa.ru", 892383067, 15000, 41);
        Employee employee3 = new Employee("Игорь", "Директор", "dd@aa.ru", 811146737, 100000, 60);
        Employee employee4 = new Employee("Ольга", "Уборщица", "clclc@aa.ru", 892342222, 100, 33);

        Employee[] employees = new Employee[4];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].getInfo();
            }
        }
    }
}