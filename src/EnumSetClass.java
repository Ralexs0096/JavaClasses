import java.util.EnumSet;

public class EnumSetClass {
    public static void main(String[] args) {
        // Enum - Enumeration
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println(allDays);

        EnumSet<Day> noDays = EnumSet.noneOf(Day.class);
        System.out.println(noDays);

        noDays.add(Day.MONDAY);
//        noDays.add(null); // values are checked by the compiler

        // the implementation is faster since is using bits under the hood.


    }
}