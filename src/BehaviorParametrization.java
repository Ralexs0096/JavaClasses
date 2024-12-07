import java.util.ArrayList;
import java.util.List;

enum Color {
    RED, GREEN
}

class Apple {
    public Color getColor() {
        return Color.RED;
    }
}

public class BehaviorParametrization {
    public static void main(String[] args) {
        ArrayList<Apple> inventory = new ArrayList<>();

        var result = filterRedApples(inventory);

    }

    static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> greenApples = new ArrayList<>();

        for (Apple apple : inventory) {
            if (Color.GREEN.equals(apple.getColor())) {
                greenApples.add(apple);
            }
        }

        return greenApples;
    }

    static List<Apple> filterRedApples(List<Apple> inventory) {
        List<Apple> greenApples = new ArrayList<>();

        for (Apple apple : inventory) {
            if (Color.RED.equals(apple.getColor())) {
                greenApples.add(apple);
            }
        }

        return greenApples;
    }
}
