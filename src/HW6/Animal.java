package HW6;

public class Animal {
    String name;
    String type;
    int run;
    int swim;

    public Animal(String name){
        this.name = name;
        this.type = type;
        this.run = run;
        this.swim = swim;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void run(int runDist) {
        System.out.println("Бег: " + runDist);
    }

    public void swim(int swimDist) {
        System.out.println("Заплыв: " + swimDist);
    }

    public String getName() {
        return name;
    }



}
