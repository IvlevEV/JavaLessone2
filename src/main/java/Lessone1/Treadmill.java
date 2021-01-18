package Lessone1;

public class Treadmill implements Lessone1.Obstacle {

    int length = (int) (Math.random() * 100);

    @Override
    public boolean take(Activity activity) {
        if (activity.getRunLimit() > length) {
            activity.run(length);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Беговая дорожка" + "[ длиной = " + length +']';
    }
}


//Беговая дорожка