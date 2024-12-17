import java.awt.*;

public class PrimitivesVsReference {
    public static void main(String[] args) {
        /** ----------- primitives ----------- */
        // how primitives work
        int num1 = 9;
        int num2 = num1;

        num1 = 12;

        System.out.println(num2);

        /** ----------- reference ----------- */
        Point point1 = new Point(9, 9); // complex object
        Point point2 = point1;

        point1.x = 5;
        point2.y = 4;

        System.out.println(point1);
    }
}
