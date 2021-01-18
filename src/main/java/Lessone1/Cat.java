package Lessone1;

public class Cat implements Activity {

    private final String name;
    private static int counter = 0;

    public Cat() {
        counter++;
        name = "Объект кот № " + counter;
    }

    @Override
    public void jump(int height) {
        System.out.println(name + " прыгнул на " + height + " метров");

    }

    @Override
    public int getJumpLimit() {
        return 100;
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " метров");
    }

    @Override
    public int getRunLimit() {
        return 100;
    }

    @Override
    public String getName() {
        return name;
    }
}
