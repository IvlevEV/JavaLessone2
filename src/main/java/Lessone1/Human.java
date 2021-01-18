package Lessone1;

public class Human implements Activity {

    private final String name;
    private static int counter = 0;
    private final int jumpLimit;
    private final int runLimit;

    public Human(int jumpLimit, int runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
        counter++;
        name = "Объект Человек № " + counter;
    }

    @Override
    public void jump(int height) {
        System.out.println(name + " прыгнул на " + height + " метров");
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " метров");
    }

    @Override
    public String getName() {
        return name;
    }

}


// Люди чеолвекии