package Lessone1;

public class Wall implements Lessone1.Obstacle {

    int height = (int) (Math.random() * 100);

    @Override
    public boolean take(Activity person) {
        if (person.getJumpLimit() > height) {
            person.jump(height);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Стена" + "[ высотой = " + height + ']';
    }
}


//Стена