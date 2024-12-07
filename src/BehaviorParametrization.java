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

interface ApplePredicate {
    boolean test(Apple apple);
}

public class BehaviorParametrization {
    public static void main(String[] args) {
        ArrayList<Apple> inventory = new ArrayList<>();

        var greenApples = filterApples(inventory, (Apple apple) -> Color.GREEN.equals(apple.getColor()));
        var redApples = filterApples(inventory, (Apple apple) -> Color.RED.equals(apple.getColor()));
        var heavyApples = filterApples(inventory, (Apple apple) -> apple.getWeight() > 150);

    }

    // DRY - Don't Repeat Yourself
    static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }
}
