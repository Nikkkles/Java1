package Lesson7;

public class Plate {
    private int food;

    // конструктор, передающий кол-во еды
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public int addFood() {
        this.food = getFood()+food;
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
