package Lessone1;

public interface Overcoming_Obstacles {

    String getName();

    default void take(Lessone1.Obstacle... obstacles) {
        for (Lessone1.Obstacle obstacle : obstacles) {
            if (!obstacle.take((Activity) this)) {
                System.out.println(obstacle + " не может быть покорена " + getName());
                return;
            }
        }
        System.out.println("Все препятствия были покорены " + getName());
    }
}
