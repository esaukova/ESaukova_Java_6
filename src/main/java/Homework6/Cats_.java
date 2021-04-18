package Homework6;

public class Cats_ extends Animals {

    public Cats_(String name) {
        super(name);
        runLimit = 200;
        swimLimit = 0;
    }

    @Override
    public void run(int distance) {

        if (distance <= runLimit) {
            System.out.println("Cat " + getName() + "run " + distance + "m ");
        } else {
            System.out.println("Cat " + getName() + "has tired ");
        }

    }

    @Override
    public void swim(int distance) {
        throw new RuntimeException("Cats don't swim");

    }

}
