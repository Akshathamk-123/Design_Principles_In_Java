package SOLID_principles;

// Workable interface
interface Workable {
    void work();
}

// Eatable interface
interface Eatable {
    void eat();
}

// Sleepable interface
interface Sleepable {
    void sleep();
}
// HumanWorker class
class HumanWorker implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        System.out.println("HumanWorker is working.");
    }

    @Override
    public void eat() {
        System.out.println("HumanWorker is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("HumanWorker is sleeping.");
    }
}

// RobotWorker class
class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("RobotWorker is working.");
    }
}
// Main class to test Interface Segregation Principle
public class interface_segregation {
    public static void main(String[] args) {
        Workable humanWorker = new HumanWorker();
        Eatable humanEatable = (Eatable) humanWorker;
        Sleepable humanSleepable = (Sleepable) humanWorker;

        Workable robotWorker = new RobotWorker();

        humanWorker.work();
        humanEatable.eat();
        humanSleepable.sleep();

        robotWorker.work();
    }
}
