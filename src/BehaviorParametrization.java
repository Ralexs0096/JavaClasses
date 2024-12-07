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

class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }
}

class AppleRedColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return Color.RED.equals(apple.getColor());
    }
}

class AppleHeavyPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}

public class BehaviorParametrization {
    public static void main(String[] args) {
        ArrayList<Apple> inventory = new ArrayList<>();

        var greenApples = filterApples(inventory, new AppleGreenColorPredicate());
        var redApples = filterApples(inventory, new AppleRedColorPredicate());
        var heavyApples = filterApples(inventory, new AppleHeavyPredicate());

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
