package Lesson7;

public class App {
    public static void main(String[] args) {

        Cat[] cat = new Cat[2];
        cat[0] = new Cat("Барсик", 200, true);
        cat[1] = new Cat("Марс", 10, true);

        Plate plate = new Plate(150);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);

        }
        //cat1.eat(plate); // первый поел
        //cat2.eat(plate); // второй поел
        //System.out.println(plate.getFood());

    }
}
