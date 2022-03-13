package HW6;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Vasya", 100, 10);
        System.out.println(cat.getName());
        cat.run(100);
        cat.swim(10);

    }
}
