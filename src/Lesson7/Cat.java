package Lesson7;

public class Cat {
    public static int countOfCats = 0;
    private String name;
    private int appetite;
    private boolean isHungry;

    public Cat(String name, int appetite, boolean isHungry) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
        countOfCats++;
    }

    // метод покушать
    public void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.setFood(plate.getFood() - appetite);
            isHungry = false;
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Кот " + name + " не поел - мало еды");
        }
    }

    public boolean isHungry() {
        return isHungry;
    }

    // метод получить имя кота
    public String getName() {
        return name;
    }

    // метод счета котов
    public static int getCountOfCats() {
        return countOfCats;
    }
}
