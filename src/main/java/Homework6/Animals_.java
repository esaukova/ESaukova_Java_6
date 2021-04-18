package Homework6;

public abstract class Animals_ {

    protected int runLimit;
    protected int swimLimit;
    protected final String name;

    protected Animals_(String name) {
        this.name = name;
    }


    public abstract void run (int distance);
    public abstract void swim (int distance);

    public String getName() {
        return name;
    }
}
