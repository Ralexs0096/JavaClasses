import java.util.ArrayList;
import java.util.List;

enum Color {
    RED, GREEN
}

class Apple {
    public Color getColor() {
        return Color.RED;
    }

    public Integer getWeight() {
        return 1;
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
        List<Apple> redApple = new ArrayList<>();

        for (Apple apple : inventory) {
            if (Color.RED.equals(apple.getColor())) {
                redApple.add(apple);
            }
        }

        return redApple;
    }

    static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }

        return result;
    }
}
